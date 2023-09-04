package estruturasSequenciais;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10.34986;
		String nome = "tete";
		int idade = 19;
		double renda = 2.30;

		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO " + x + " METROS");
		System.out.printf("RESULTADO É IGUAL A: %.2f%n", x);

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda);

		// %S = string
		// %D = inteiro
		// %f = flutuante (numero com ponto [US] ou virgula [BR])
	}
}

//String product1 = "Computer";
//String product2 = "Office Desk";
//int age = 20;
//int code = 4438;
//char gender = 'M';
//double price1 = 2100.0;
//double price2 = 650.50;
//double measure = 53.234567;
//
//System.out.println("Products:");
//System.out.printf("%S, which price is $ %.2f%n", product1, price1);
//System.out.println();
//System.out.printf("%S, which price is $ %.2f%n", product2, price2);
//System.out.printf("Record: %d years old, code %d and gender %S%n", age, code, gender);
//System.out.println();
//System.out.printf("Measure with eight decimal places: %.8f%n", measure);
//System.out.println();
//System.out.printf("US decimal point: %.3f%n", measure);
//Locale.setDefault(Locale.US);
//System.out.printf("Rouded (three decimal places): %.3f%n", measure);
