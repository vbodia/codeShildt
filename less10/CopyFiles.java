import java.io.*;
class CopyFiles
{
	public static void main(String args[])
	{
		FileInputStream fin;
		FileOutputStream fout;
		int i;

		if(args.length != 2)
		{
			System.out.println("Usage: CopyFile from To ");
			return;
		}

		try
		{
			fin = new FileInputStream(args[0]);
		}
		catch(FileNotFoundException exc)
		{
			System.out.println("File not found");
			return;
		}

		try
		{
			fout = new FileOutputStream(args[1]);
		}
		catch(FileNotFoundException exc)
		{
			System.out.println("Error Opening Output File.");

			try
			{
				fin.close();
			}
			catch(IOException exc2)
			{
				System.out.println("Error closing input file.");
			}
			return;
		}
		try
		{
			do
			{
				i = fin.read();
				if(i != -1)
				{
					if(i == ' ')
					{
						i = '-';					
					}
					fout.write(i);
				}
			}
			while(i != -1);
		}
		catch(IOException exc)
		{
			System.out.println("File Error!");
		}

		try
		{
			fin.close();
		}
		catch(IOException exc)
		{
			System.out.println("Error closing input file");
		}

		try
		{
			fout.close();
		}
		catch(IOException exc)
		{
			System.out.println("Error closing output file");
		}
	}
}