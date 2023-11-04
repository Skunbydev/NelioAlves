package exers;

import java.util.Locale;
import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        //mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        //os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantos elementos terão dentro do vetor?");
        int qtd = sc.nextInt();
        double[] vect = new double[qtd];

        double media = 0.00;
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o número do %dº vetor", i);
            System.out.println();
            vect[i] = sc.nextInt();
            media += vect[i];
        }
        media = media / qtd;

        for (int i = 0; i < vect.length; i++) {
            if (media > vect[i] ) {
                System.out.println("Os numeros menores que a média são: ");
                System.out.println(vect[i]);
            }
        }


    }
}
