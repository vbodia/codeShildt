class Outer
{
	int nums[];

	Outer(int n[])
	{
		nums = n;
	}

	void Analyze()
	{
		Inner inOb = new Inner();

		System.out.println("Minimum " + inOb.min());
		System.out.println("Maximum " + inOb.max());
		System.out.println("Average " + inOb.avg());
	}
	class Inner
	{
		int min()
		{
			int m = nums[0];
			for(int i=1; i<nums.length; i++)
				if(nums[i]<m)
					m=nums[i];
				return m;
		}
		
		int max()
		{
			int m = nums[0];
			for(int i=1; i<nums.length; i++)
				if(m<nums[i])
					m = nums[i];
				return m;
		}

		int avg()
		{
			int a = 0;
			for(int i=0; i<nums.length; i++)
				a +=nums[i];
			return a/nums.length;
		}
	}
}

class NestedClassDemo
{
	public static void main(String args[])
	{
		int x[] = {3,4,2,6,1,7,8,2};
		Outer outOb = new Outer(x);
		outOb.Analyze();
	}
}

