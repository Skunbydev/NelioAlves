package orientacaoAObjeto;

import java.util.Locale;
import java.util.Scanner;

public class ResolucaoProblema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X:");
		xA = sc.nextInt();
		xB = sc.nextInt();
		xC = sc.nextInt();
		
		System.out.println("Enter the measures of triangle Y:");
		yA = sc.nextInt();
		yB = sc.nextInt();
		yC = sc.nextInt();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p- xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p- yC));
		
		System.out.printf("Triangle X area: %.4f%n \n", areaX);
		System.out.printf("Triangle y area: %.4f%n \n", areaY);
		
		if (areaX > areaY) 
			System.out.println("Larger area X:");
		else 
			System.out.println("Larger area Y:");
		sc.close();;
				
	}

}
