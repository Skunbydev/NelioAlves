package exers;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        //Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        //que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        //de homens.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas pessoas você irá digitar?");
        int qtd = sc.nextInt();
        String[] nome = new String[qtd];
        double[] vectF = new double[qtd], vectM = new double[qtd], altura = new  double[qtd];




        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite o nome da %dº pessoa", i + 1);
            System.out.println();
            nome[i] = sc.nextLine();
            System.out.println("Agora, a altura: ");
            


        }
    }
}
