class Sum6
{
	int sum(int ...a)
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
			sum +=a[i];
		return sum;
	}
}

class SumTest
{
	public static void main(String args[])
	{
		Sum6 ob = new Sum6();
		int sum1 = ob.sum(1,2,3);
		System.out.println(sum1);
		sum1 = ob.sum(1,2,3,4,5);
		System.out.println(sum1);
	}
}