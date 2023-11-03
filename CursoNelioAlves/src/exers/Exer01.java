package exers;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
       // Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
       // e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você deseja digitar?");
        int qtd = sc.nextInt();
        double [] vect = new double[qtd];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o número: ");
            vect[i] = sc.nextInt();
        }


        System.out.println("Numeros negativos: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }

        }

        System.out.println("Fim do programa");
        sc.close();

    }
}
