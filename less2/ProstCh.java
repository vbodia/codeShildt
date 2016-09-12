class ProstCh
{
	public static void main(String args[])
	{
		int i,j;
		boolean prost = true;
		for(i=2; i<100; i++)
		{
			for(j=2; j<i; j++)
			   {
				    if(i%j != 0)
					prost = true;
				    else
					  {
						prost = false;
				        break;
				      }   
			   }
			if (prost == true)
			System.out.println(i+ " Prostoe chislo");

		}

	}
}