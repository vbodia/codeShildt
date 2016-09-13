import java.io.*;
class ShowFile
{
	public static void main(String args[])
	{
		int i;
		FileInputStream fin = null;

		if(args.length != 1)
		{
			System.out.println("Usage: ShowFile File");
			return;
		}

		try
		{
			fin = new FileInputStream(args[0]);
			do
			{
				i = fin.read();
				if(i != -1)
					System.out.print((char) i);
			}
			while(i != -1);
		}	
		catch(FileNotFoundException exc)
		{
			System.out.println("Error not found.");
		}
		catch(IOException exc)
		{
			System.out.println("An I/O Error Occurred");
		}
		finally
		{
			try
			{
				if(fin != null)
					fin.close();
			}
			catch(IOException exc)
			{
				System.out.println("Error closing file.");
			}
		}
		System.out.println();
	}
}
