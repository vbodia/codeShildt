class TwoShapes
{
	private double width;
	private double heigth;

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
		System.out.println("Width and Heigth " + width + " and " + heigth);
	}
}

class Triangle extends TwoShapes
{
	private String style;

	Triangle(String s, double h, double w)
	{
		setWidth(w);
		setHeigth(h);
		style = s;
	}
	double area()
	{
		return getHeigth()*getWidth()/2;
	}

	void showStyle()
	{
		System.out.println("Triangle is: " + style);
	}
}

class Shapes2
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle("isosceles", 4.0,4.0);
		Triangle t2 = new Triangle("rigth", 8.0, 12.0);

		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());

		System.out.println();

		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());

	}
}