class TwoDShapes
{
	private double width;
	private double heigth;

	TwoDShapes()
	{
		width = heigth = 0;
	}

	TwoDShapes(double w, double h)
	{
		width = w;
		heigth =h;
	}

	TwoDShapes(double x)
	{
		width = heigth = 0;
	}

	TwoDShapes(TwoDShapes ob)
	{
		width = ob.width;
		heigth = ob.heigth;
	}
	double getWidth(){return width;}
	double getHeigth(){return heigth;}
	void setWidth(double w){width = w;}
	void setHeigth(double h){heigth = h;}

	void showDim()
	{
		System.out.println("Width and Heigth are " + width + " and " + heigth);
	}
}

class Triangle extends TwoDShapes
{
	private String style;

	Triangle()
	{
		super();
		style = "null";
	}
	Triangle(String s, double w, double h)
	{
		super(w,h);
		style = s;
	}
	Triangle(double x)
	{
		style = "isosceles";
	}
	Triangle(Triangle ob)
	{
		super(ob);
		style = ob.style;
	}
	double area()
	{
		return getHeigth()*getWidth()/2;
	}
	void showStyle()
	{
		System.out.println("Trangle is " + style);
	}
}

class Shapes7
{
	public static void main(String args [])
	{
		Triangle t1 = new Triangle("rigth", 8.0, 12.0);
		Triangle t2 = new Triangle(t1);

		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is t1: " + t1.area());

		System.out.println();

		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is t2: " + t2.area()); 
	}
}
