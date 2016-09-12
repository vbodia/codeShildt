class GalToDuTable{
	public static void main(String args[]){
		double meters;
		int counter, du;
		counter = 0;
		for(du=1; du<=100; du++){
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