import java.io.*;
class RandomAccessDemo
{
	public static void main(String args[])
	{
		double data [] = {19.4,10.1,123.54,33.0,87.9,74.25};
		double d;

		try(RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) // file s proizvolnim dostupom dlya chteniya i zapisi
		{
			for(int i=0; i<data.length; i++)
				{
					raf.writeDouble(data[i]);
				} 
					raf.seek(0); //nayti pervoe znachenie double 
					d = raf.readDouble(); 
					System.out.println("First value is " + d);

					raf.seek(8); // nayti vtoroe znachenie
					d = raf.readDouble();
					System.out.println("Second value is " + d);

					raf.seek(8*3); // nayti chetvertoe znachenie double
					d = raf.readDouble();
					System.out.println("Fourth value is " + d);

					System.out.println();

					//prochitat znachenie cherez odno
					System.out.println("Here is every other valueL ");
					for(int i=0; i<data.length; i+=2)
					{
						raf.seek(8*i); // nayti i-toe znachenie tipa double
						d = raf.readDouble();
						System.out.println(d + " ");
					}
		}
		catch(IOException exc)
		{
			System.out.println("I/O Error: " + exc);
		}
	}
}