class GalToLit{ // Эта программа преобразует галлоны в литры 
	public static void main(String args[]){
		double gallons; // в этой переменной хранится обьем жидкости в галлонах 
		double liters;  // в этой переменной хранится обьем жидкости в литрах
		gallons = 10; // значение равно 10
		liters = gallons * 3.7854; // преобразовать галлоны в литры
		System.out.println(gallons + " gallons is " + liters + " liters.");
	}

}