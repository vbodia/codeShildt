import java.io.*;
public class PrintWriteDemo
{
	public static void main(String args[])
	{
		int i = 10;
		double d = 123.65;

		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println("Using a PrintWrite");
		pw.println(i);
		pw.println(d);

		pw.println(i + " + " + d + " is " + (i+d));

	}
}