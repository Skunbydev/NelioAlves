package exers;

import exers.Entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.println("How many peoples in room?");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Rent #"+ i);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room number: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
