class MetToFootTable{
	public static void main(String args[]){
		double meters;
		int counter, foots;
		counter = 0;
		for(foots=1; foots<=100; foots++){
			meters = foots*39.37;
			System.out.println(foots + " meters is " + meters + " foots");
			counter++;
			if(counter==12){
				System.out.println();
				counter=0;
			}
		}

	}
}