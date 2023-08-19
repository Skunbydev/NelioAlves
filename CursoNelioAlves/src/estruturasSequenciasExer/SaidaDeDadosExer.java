package estruturasSequenciasExer;

import java.util.Locale;

public class SaidaDeDadosExer {

	public static void main(String[] args) {
//		Em um novo programa, inicie as 
//		seguintes variáveis:
//		String product1 = "Computer";
//		String product2 = "Office desk";
//		int age = 30;
//		int code = 5290;
//		char gender = 'F';
//		double price1 = 2100.0;
//		double price2 = 650.50;
//		double measure = 53.234567;

//		Em seguida, usando os valores das variáveis, produza a 
//		seguinte saída na tela do console:

//		Products:
//		Computer, which price is $ 2100,00
//		Office desk, which price is $ 650,50

//		Record: 20 years old, code 4438 and gender: F

//		Measure with eight decimal places: 53,23456700
//		Rouded (three decimal places): 5,235
//		US decimal point: 53.235

		// %S = string
		// %D = inteiro
		// %f = flutuante

		String product1 = "Computer";
		String product2 = "Office Desk";
		int age = 20;
		int code = 4438;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products: %n");
		System.out.printf("%s, which price is %.2f %n", product1, price1);
		System.out.printf("%s, which price is %.2f %n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.println();
		System.out.printf("Measure whith eight decimal places: %.8f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f ", measure);

	}

}
