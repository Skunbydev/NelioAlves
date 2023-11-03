package exers;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        //- Imprimir todos os elementos do vetor
        //- Mostrar na tela a soma e a média dos elementos do vetor

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números a serem digitados:");
        int qtd = sc.nextInt();
        double[] vect = new double[qtd];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Insira o número: ");
            vect[i] = sc.nextInt();
        }

        double sum = 0.00;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.printf("A soma é: %.2f\n", sum);
        System.out.println("A média é: "+ avg);

    }
}
