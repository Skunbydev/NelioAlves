package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class SintaxeOpcional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira aqui os minutos que o usuário usou:");
		
		int minutes = sc.nextInt();
		
		double bill = 50.00;
		
		if (minutes > 100) 
			bill += (minutes - 100) * 2;
		
		System.out.printf("This value of bill is: R$ %.2f", bill);
		sc.close();

}
	}
	
