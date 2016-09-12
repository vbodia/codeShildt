class My3_3
{
	public static void main(String args[])
	throws java.io.IOException
	{
		int count=0;
		char ch;
		do
		{
			ch = (char) System.in.read();
			if (ch>='a' & ch<='z')
			{
				ch-=32;
				count++;
			}
			else
				if(ch>='A' & ch<='Z')
				{
					ch+=32;
					count++;
				}
				System.out.print(ch);
		}
		while(ch!='.');
		System.out.println(count);		
	}
}