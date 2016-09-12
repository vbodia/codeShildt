class StrOps
{
	public static void main(String args[])
	{
		String str1 = "When it comes to Web programming, java is #1";
		String str2 = new String(str1);
		String str3 = "Java string are powerful";
		int result, idx;
		char ch;

		System.out.println("Length of str1: " + str1.length());

		for(int i=0; i<str1.length(); i++)
			System.out.print(str1.charAt(i));
		System.out.println();

		if(str1.equals(str2))
			System.out.println("str1 equals str2");
		else
			System.out.println("str1 does not equal str2");

		if(str1.equals(str3))
			System.out.println("str1 equals str3");
		else
			System.out.println("str1 does not equal str3");

		result = str1.compareTo(str3);
		if (result==0)
			System.out.println("str1 and str3 are equal");
		else 
			if(result<0)
				System.out.println("str1 is less than str3");
			else 
				System.out.println("str1 is greater then str3");
		
		str2 = "One Two Tree One";

		idx = str2.indexOf("One");
		System.out.println("Indes first occurrence of One: " + idx);
		idx = str2.lastIndexOf("One");
		System.out.println("Index of last occurrence of One: " + idx);

	}
}