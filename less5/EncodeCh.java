class EncodeCh
{
	public static void main(String args[])
	{
		String msg ="This is a test";
		String encmsg = "";
		String decmsg = "";
		String key = "qwwwfr";
		int j = 0;

		System.out.print("Original massage: ");
		System.out.println(msg);

		for(int i=0; i<msg.length(); i++)
		{
			encmsg = encmsg + (char)(msg.charAt(i) ^ key.charAt(j));
			j++;
			if(j==key.length())
				j=0;
		}
		System.out.print("Encoded message:");
		System.out.println(encmsg);
		
		j=0;
		for(int i=0; i<encmsg.length(); i++)
		{
			decmsg = decmsg + (char)(encmsg.charAt(i) ^ key.charAt(j));
			j++;
			if(j==key.length())
				j=0;
		}

		System.out.print("Decoded message:");
		System.out.println(decmsg);
	}
}