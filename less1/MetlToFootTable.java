class MetToFootTable{
	public static void main(String args[]){
		double meters;
		int counter, foots;
		counter = 0;
		for(foots=1; foots<=100; foots++){
			meters = du*39.37;
			System.out.println(du + " du is " + meters + " meters");
			counter++;
			if(counter==12){
				System.out.println();
				counter=0;
			}
		}

	}
}