class My3
{
	public static void main(String args[])
	throws java.io.IOException
	{
		int count = 0;
		for(;;)
		{
		char ch = (char) System.in.read();
	    if (ch==' ')
	    	count++;
		if (ch =='.')
		break;
	    }
	    System.out.println(count);
	}

}