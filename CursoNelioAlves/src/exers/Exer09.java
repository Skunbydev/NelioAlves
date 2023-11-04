package exers;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {

        //Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        //devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        //da pessoa mais velha.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitados: ");
        int qtd =  sc.nextInt();
        sc.nextLine();
        String[]  vectNome = new String[qtd];
        int[] vectIdade = new int[qtd];

        for (int i = 0; i < vectIdade.length; i++) {
            System.out.printf("Digite abaixo o nome da %dº pessoa: ", i+ 1);
            vectNome[i] = sc.nextLine();
            System.out.println("Agora, a idade: ");
            vectIdade[i] = sc.nextInt();
            sc.nextLine();
        }

        int idadeMaisAlta = vectIdade[0];
        String nomeMaisVelho = vectNome[0];

        for (int i = 0; i < vectIdade.length; i++) {
            if (vectIdade[i] > idadeMaisAlta) {
                idadeMaisAlta = vectIdade[i];
                nomeMaisVelho = vectNome[i];
            }
        }
        System.out.printf("A pessoa mais velha é: %s, com %d anos", nomeMaisVelho, idadeMaisAlta);

    }
}
