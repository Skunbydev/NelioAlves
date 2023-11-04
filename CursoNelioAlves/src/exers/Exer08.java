package exers;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        //Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        //aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        //digitado, mostrar a mensagem "NENHUM NUMERO PAR"

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão digitados?");
        int qtd = sc.nextInt();
        double[] vect = new double[qtd];


        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %d numero: ", i + 1);
            System.out.println();
            vect[i] = sc.nextInt();
        }
        double soma = 0.00;
        int count = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                count++;
            }
        }

        if (count > 0) {
            double media = soma / count;
            System.out.printf("Média dos números pares: %.1f%n", media);
        } else
            System.out.println("Não existe números pares.");
    }
}
