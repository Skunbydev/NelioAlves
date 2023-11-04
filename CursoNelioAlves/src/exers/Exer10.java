package exers;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        //Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        //no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        //os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        //igual a 6.0 (seis).

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Digite quantos alunos serão digitados: ");
        int qtd = sc.nextInt();
        sc.nextLine();
        String[] vectNome = new String[qtd];
        double[] nota1 = new double[qtd];
        double[] nota2 = new double[qtd];



        for (int i = 0; i < vectNome.length; i++) {
            System.out.printf("Digite o nome do(a) %dº aluno(a)", i + 1);
            System.out.println();
            vectNome[i] = sc.nextLine();
            System.out.println("Agora, a primeira nota: ");
            nota1[i] = sc.nextDouble();
            System.out.println("Agora, a segunda nota: ");
            nota2[i] = sc.nextDouble();
            sc.nextLine();

        }

        System.out.println("Alunos aprovados: ");

        double mediaEscolar = 0.00;
        for (int i = 0; i < qtd; i++) {
            mediaEscolar = (nota1[i] + nota2[i]) / 2;
            if (mediaEscolar >= 6.00 ) {
                System.out.printf("%s\n", vectNome[i]);
            }
        }
        sc.close();

    }
}
