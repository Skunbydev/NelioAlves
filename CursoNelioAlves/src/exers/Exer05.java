package exers;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite aqui a quantidade de números digitados: ");
        int qtd = sc.nextInt(), posMaior;
        double[] vect = new double[qtd];
        double vectMaior;


        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextInt();
        }


        vectMaior = vect[0];
        posMaior = 0;

        for (int i = 1; i < vect.length; i++) {
            if (vect[i]  > vectMaior) {
                vectMaior = vect[i];
                posMaior = i + 1;
            }
        }
        System.out.println(vectMaior);
        System.out.println(posMaior);
        sc.close();
    }
}
