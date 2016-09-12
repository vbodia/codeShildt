class SqrRoot
{
	public static void main(String args[])
	{
		double num, sroot, rerr;
		for(num = 10; num < 100.0; num++)
		{
			sroot = Math.sqrt(num);
			System.out.println("Square root of " + num + " is " + sroot);
			rerr = (sroot * sroot);
			System.out.println("Rounding error is " + rerr);
			System.out.println();
		}
	}
}