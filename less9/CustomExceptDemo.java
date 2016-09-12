class NonIntResultException extends Exception
{
	int n;
	int d;

	NonIntResultException(int i, int j)
	{
		n = i;
		d = j;
	}

	public String toString()
	{
		return "Resultof " + n + " / " + d + " is non-integer.";
	}
}

class CustomExceptDemo
{
	public static void main(String args[])
	{
		int numb[] = {4,8,15,32,64,127,256,512};
		int danom[] = {2,0,4,4,0,8};

		for(int i=0; i<numb.length; i++)
		{
			try
			{
				if(numb[i]%2 != 0)
					throw new NonIntResultException(numb[i],danom[i]);
				System.out.println(numb[i] + " / " + danom[i] + " is " + numb[i]/danom[i]);
			}
			catch(ArrayIndexOutOfBoundsException exc)
			{
				System.out.println("No matching element found.");
			}
			catch(ArithmeticException exc)
			{
				System.out.println("Can't devide by Zero.");
			}
			catch(NonIntResultException exc)
			{
				System.out.println(exc);
			}
		}
	}
}