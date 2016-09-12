class ShowBits
{
	public static void main(String args [])
	{
		int i;
		byte val;

		val = 123;
		for(int t=128; t>0; t = t/2)
		{
			if((val & t)!=0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
	}
}