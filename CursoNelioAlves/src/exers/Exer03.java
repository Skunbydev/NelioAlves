package exers;


import exers.Entities.Exer03Entite;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int qtd = sc.nextInt();
        sc.nextLine();
        Exer03Entite[] vect = new Exer03Entite[qtd];

        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite os dados da %d pessoa", i+1);
            System.out.println();

            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Exer03Entite(nome, idade, altura);


            sum += altura;

            if (idade < 16) {
                count++;
            }
        }
        double avg = sum / vect.length;
        double percentage = (double)count / vect.length * 100;

        System.out.printf("Altura mais alta: %.2f%n", avg);
        System.out.printf("Porcentagem de pessoas abaixo de 16: %.2f%%%n", percentage);

        System.out.println("nome das pessoas abaixo de  16:");
        for (Exer03Entite e : vect) {
            if (e.getIdade() < 16) {
                System.out.println(e.getNome());
            }
        }

        sc.close();
    }
}



