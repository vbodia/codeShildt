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
		System.out.println("Width and heigth are " + width + " and " + heigth);
	}
}

class Triangle extends TwoShapes
{
	String stile;
	
	double area()
	{
		return getWidth()*getHeigth()/2;
	}

	void showStile()
	{
		System.out.println("Triangle is " + stile);
	}
}

class Shapes
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.setWidth(4.0);
		t1.setHeigth(4.0);
		t1.stile = "isosceles";

		t2.setWidth(8.0);
		t2.setHeigth(12.0);
		t2.stile = "rigth";

		System.out.println("Info for t1: ");
		t1.showStile();
		t1.showDim();
		System.out.println("Area is " + t1.area());

		System.out.println();

		System.out.println("Info for t2: ");
		t2.showStile();
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}