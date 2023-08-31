package estruturaCondicional;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Construção utilizando IF E ELSE
		 */
		
		
		/*
		 * Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número de 1 à 7. 1, é domingo, 2, segunda e por aí vai.");
		int x = sc.nextInt();
		String dia = null;
		
		
		if (x == 1) 
			dia = "domingo";
		
		else if (x == 2)
		 	dia = "segunda";
		else if (x == 3)
			dia = "terca";
		else if (x == 4)
			dia = "quarta";
		else if (x == 5)
			dia = "quinta";
		else if (x == 6)
			dia = "sexta";
		else if (x == 7)
			dia = "sábado";
		else
			dia = "numero nao aceito.";
		
		
		
		
		System.out.println(dia);
		
		
		
		sc.close();


		 */
		
		/* 
		 * Construção usando o BREAK 
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem vindo ao contador de dias.");
		System.out.println("Digite seu número, e te diremos o dia referente.");
		System.out.println("Coloque o número abaixo:");
		
		int diaNumero = sc.nextInt();
		String dia;
		
		switch (diaNumero) {
		case 1: 
			dia="Domingo";
		break;
		case 2:
			dia="Segunda";
		break;
		case 3:
			dia="Terça-feira";
		break;
		case 4:
			dia="Quarta-feira";
		break;
		case 5:
			dia="Quinta-feira";
		break;
		case 6:
			dia="Sexta-feira";
		break;
		case 7:
			dia="Sábado";
		break;
		default:
			dia="Inválido";
		break;
		}
		
		System.out.println(dia);
		
		
		
		
		
		
		
		sc.close();
	}

}
