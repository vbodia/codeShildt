enum Transport
{
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo2
{
	public static void main(String args[])
	{
		Transport tp;

		System.out.println("Here are all Transport constants");
		
		Transport allTransport[] = Transport.values();

		for(Transport t: allTransport)
			System.out.println(t);

		System.out.println();

		tp = Transport.valueOf("AIRPLANE");

		System.out.println("tp contains " + tp);
	}
}