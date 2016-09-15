import java.io.*;
class ReadChars
{
	public static void main(String args[]) throws IOException
	{
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Sozdanie ob'ekta BufferReader cvazannogo s potokom vdof System.in

		System.out.println("Enter characters, period to quit.");
		//chitat' simvoli

		do
		{
			c = (char) br.read();
			System.out.println(c);
		}
		while (c != '.');
	}
}