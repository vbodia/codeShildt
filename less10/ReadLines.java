import java.io.*;
class ReadLines
{
	public static void main(String args[]) throws IOException
	{
		String str;
		boolean str1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to quit.");

		do
		{
			str = br.readLine();
			System.out.println(str);
		}
		while(!str.equals("stop"));
	}
}