class StringDemo
{
	public static void main(String args[])
	{
		String str = new String("Java string are objects");
		String str1 = "They are constructed various ways ";
		String str2 = new String(str1);

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}
}