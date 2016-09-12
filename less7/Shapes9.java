abstract class TwoDShape
{
	private double width;
	private double heigth;
	private String name;

	TwoDShape()
	{
		width = heigth = 0;
		name = "null";
	}

	TwoDShape(double w, double h, String n)
	{
		width = w;
		heigth = h;
		name = n;
	}

	TwoDShape(double x, String n)
	{
		width = heigth = x;
		name = n;
	}

	TwoDShape(TwoDShape ob)
	{
		width = ob.width;
		heigth = ob.heigth;
		name = ob.name;
	}

	double getWidth(){return width;}
	double getHeigth(){return heigth;}
	String getName(){return name;}

	void setWidth(double w){width = w;}
	void setHeigth(double h){heigth = h;}

	void showDim()
	{
		System.out.println("Width and Heigth are: " + width + " and " + heigth);
	}

	abstract double area();
}

class Triangle extends TwoDShape
{
	private String style;

	Triangle()
	{
		super();
	}

	Triangle(double w, double h, String s)
	{
		super(w,h,"triangle");
		s = style;
	}
	Triangle(double x)
	{
		super(x, "triangle");
		style = "isosceles";
	}
	Triangle(Triangle ob)
	{
		super(ob);
		style = ob.style;
	}
	double area()
	{
		return getWidth()*getHeigth()/2;
	}
	void showStyle()
	{
		System.out.println("Triangle is " + style);
	}
}

class Rectangle extends TwoDShape
{
	Rectangle()
	{
		super();
	}
	Rectangle(double w, double h)
	{
		super(w,h,"rectangle");
	}
	Rectangle(double x)
	{
		super(x,"rectangle");
	}
	Rectangle(Rectangle ob)
	{
		super(ob);
	}
	boolean isSquare()
	{
		if(getWidth()==getHeigth())
			return true;
		else
			return false;
	}
	double area()
	{
		return getWidth()*getHeigth();
	}
}

class Circle extends TwoDShape
{
	Circle()
	{
		super();
	}

	Circle(double w, double h)
	{
		super(w,h,"circle");
	}
	Circle(double x)
	{
		super(x, "circle");
	}
	Circle(Circle ob)
	{
		super(ob);
	}
	double area()
	{
		return (getWidth()/2)*(getHeigth()/2)*3.1416;
	}
} 

class Shapes9
{
	public static void main(String args[])
	{
		TwoDShape shape[] = new TwoDShape[5];
		shape[0] = new Triangle(8.0, 12.0, "rigth");
		shape[1] = new Rectangle(10);
		shape[2] = new Rectangle(10,4);
		shape[3] = new Triangle(7.0);
		shape[4] = new Circle(4.0,4.0);

		for(int i = 0; i<shape.length; i++)
		{
			System.out.println("object is " + shape[i].getName());
			System.out.println("Area is " + shape[i].area());
			System.out.println();
		}
	}
}