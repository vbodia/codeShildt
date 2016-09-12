class TwoShapes
{
	private double width;
	private double heigth;

	TwoShapes()
	{
		width = heigth = 0.0;
	}

	TwoShapes(double w, double h)
	{
		width = w;
		heigth = h;
	}

	TwoShapes(double x)
	{	
		width = heigth = x;
	}

	double getWidth(){return width;}
	double getHeigth(){return heigth;}
	void setWidth(double w){width = w;}
	void setHeigth(double h){heigth =h;}

	void showDim()
	{
		System.out.println("Width and Heigth are " + width + " and " + heigth);
	}
}

class Triange extends TwoShapes
{
	private String style;
	Triange()
	{
		super();
		style ="null";
	}

	Triange(String s, double w, double h)
	{
		super(w,h);
		style =s;
	}

	Triange(double x)
	{
		super(x);
		style = "isosceles";
	}
	
	double area()
	{
		return getWidth()*getHeigth()/2;
	}

	void showStyle()
	{
		System.out.println("Triange is: " + style);
	}
}

class ColorTriangle extends Triange
{
	private String color;

	ColorTriangle(String c, String s, double w, double h)
	{
		super(s,w,h);
		color = c;
	}
	String getColor(){return color;}

	void showColor()
	{
		System.out.println("Color is: " + color);
	}

}

class Shapes6
{
	public static void main(String args[])
	{
		ColorTriangle t1 = new ColorTriangle("Blue", "rigth",8.0,12.0);
		ColorTriangle t2 = new ColorTriangle("Red", "isosceles", 2.0,2.0);

		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showColor();
		t1.showDim();
		System.out.println("Area is " + t1.area());

		System.out.println();

		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showColor();
		t2.showDim();
		System.out.println("Area is: " + t2.area());

		System.out.println();
	} 
}