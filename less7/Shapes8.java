class TwoDShapes
{
	private double width;
	private double heigth;
	private String name;

	TwoDShapes()
	{
		width = heigth = 0;
		name = "null";
	}

	TwoDShapes(double w, double h, String n)
	{
		width = w;
		heigth = h;
		name = n;
	}

	TwoDShapes(double x, String n)
	{
		width = heigth = x;
		name = n;
	}

	TwoDShapes(TwoDShapes ob)
	{
		width = ob.width;
		heigth = ob.heigth;
		name = ob.name;
	}

	double getWidth(){return width;}
	double getHeigth(){return heigth;}
	String getName(){return name;}
	void setWidth(double w){width = w;}
	void setHeigth(double h){heigth =h;}

	void showDim()
	{
		System.out.println("Width and Heigth are: " + width + " and " + heigth);
	}

	double area()
	{
		System.out.println("area() must be overridden");
		return 0.0;
	}
}

class Triangle extends TwoDShapes
{
	private String style;

	Triangle()
	{
		super();
		style ="null";
	}

	Triangle(double w, double h, String s)
	{
		super(w,h,"triangle");
		style = s;
	}

	Triangle(double x)
	{
		super(x,"triangle");
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
		System.out.println("Triangle is: " + style);
	}
}

class Rectangle extends TwoDShapes
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
		super(x, "rectangle");
	}

	Rectangle(Rectangle ob)
	{
		super(ob);
	}

	boolean isSquare()
	{
		if(getWidth() == getHeigth())
			return true;
		else 
			return false;
	}

	double area()
	{
		return getWidth()*getHeigth();
	}
}

class Shapes8
{
	public static void main(String args[])
	{
		TwoDShapes shapes[] = new TwoDShapes[5];

		shapes[0] = new Triangle(8.0, 12.0,"rigth");
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10,4);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new TwoDShapes(10,20,"generic");

		for(int i=0; i<shapes.length; i++)
		{
			System.out.println("object is " + shapes[i].getName());
				System.out.println("Area is " + shapes[i].area());
					System.out.println();
		}
	}
}