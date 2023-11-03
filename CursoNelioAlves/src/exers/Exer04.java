package exers;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        //Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        //tela todos os números pares, e também a quantidade de números pares.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números você pretende digitar: ");
        int qtd = sc.nextInt();
        double [] vect = new double[qtd];
        double [] vectPar = new double[qtd];
        int count = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%d número:", i + 1);
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                vectPar[count] = vect[i];
                    count++;
            }
        }
        System.out.println("Números pares:");
        for (int i = 0; i < count; i++) {
            System.out.println(vectPar[i]);
        }

        System.out.println("Quantidade de números pares: " + count);

        sc.close();
        }
    }
