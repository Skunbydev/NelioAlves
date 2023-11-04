package exers;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        //Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        //terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        //o vetor C gerado.


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite quantos números terá em cada vetor: ");
        int qtd = sc.nextInt();
        double[] vectPrimario = new double[qtd], vectSecundario = new double[qtd], vectResultado = new double[qtd];



        System.out.println("Digite os dados do primeiro vetor:");

        for (int i = 0; i < vectPrimario.length; i++) {
            System.out.printf("Digite o %dº número:", i);
            System.out.println();
            vectPrimario[i] = sc.nextInt();
        }

        System.out.println("Agora, os dados do próximo vetor: ");
        for (int i = 0; i <vectSecundario.length; i++) {
            System.out.printf("Digite o %dº número: ", i);
            System.out.println();
            vectSecundario[i] = sc.nextInt();
        }


        double soma = 0.00;
        for (int i = 0; i < vectResultado.length; i++) {
            System.out.printf("O resultado da soma do vetor %d é:", i);
            soma = vectPrimario[i] + vectSecundario[i];
            System.out.println(soma);
        }
        System.out.println();
        System.out.println("Programa encerrado.");
        sc.close();
    }
}
