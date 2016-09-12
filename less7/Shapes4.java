class TwoDShapes
{
	private double heigth;
	private double width;

	TwoDShapes(double h, double w)
	{
		heigth = h;
		width = w;
	} 

	double getWidth(){return width;}
	double getHeigth(){return heigth;}

	void setWidth(double w)
	{
		width = w;
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
	Triangle(String s, double h, double w)
	{
		super(h,w);
		style = s;
	}

	double area()
	{
		return getWidth()*getHeigth()/2;
	}

	void showStyle()
	{
		System.out.println("Trangle is: " + style);
	}
}

class Shapes4
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle("isosceles", 4.0, 4.0);
		Triangle t2 = new Triangle("rigth", 8.0, 12.0);

		System.out.println("Info fot t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is: " + t1.area());

		System.out.println();

		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area for t2: " + t2.area());
	}
}