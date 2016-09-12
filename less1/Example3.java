class Example3 { // Эта программа демонстрирует отличия между типами int и dobble 
	public static void main(String arg[]) {
	int var; // Обьявить целочисленную переменную 
	double x; // Обьявить переменную с плавающей точкой 
	var = 10; // Присвоить значение переменной var 10
	x = 10.0; // Присвоить значение переменной х 10.0
	System.out.println("Original value of x: " + var); 
	System.out.println("Original value of x: " + x);
	System.out.println(); // Вывести пустую строку
	var = var / 4; 
	x = x / 4; // разделим обе переменные на 4
	System.out.println("var after division: " + var);
	System.out.println("var after division: " + x);
   }

}