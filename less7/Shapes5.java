class TwoDShapes
{
	private double width;
	private double heigth;
	TwoDShapes()
	{
		width = heigth = 0.0;
	}

	TwoDShapes(double w, double h)
	{
		width = w;
		heigth = h;
	}

	TwoDShapes(double x)
	{
		width = heigth = x;
	}

	double getWidth(){return width;}
	double getHeigth(){return heigth;}

	void setWidth(double w)
	{
		width =w;
	}

	void setHeigth(double h)
	{
		heigth = h;
	}

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
		style =s;
	}

	Triangle(double x)
	{
		super(x);
		style ="isosceles";
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

class Shapes5
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("rigth",8.0, 12.0);
		Triangle t3 = new Triangle(4.0);

		t1 = t2;

		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area for t1: " + t1.area());

		System.out.println();

		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area for t2: " + t2.area());

		System.out.println();

		System.out.println("Info fo t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area for t3: " + t3.area());

		System.out.println();
	}
}