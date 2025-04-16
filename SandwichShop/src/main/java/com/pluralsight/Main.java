package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose your sandwich:\n" +
                "1: Regular: base price $5.45\n" +
                "2: Large: base price $8.95\n");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Would you like the sandwich loaded (yes/no):\n" +
                "Regular: base price $1.00\n" +
                "Large: base price $1.75\n");
        String secondChoice = scanner.nextLine();

        double price;

        if (choice == 1 && secondChoice.equals("yes")){
            price = 6.45;
        } else if(choice == 2 && secondChoice.equals("yes")){
            price = 10.07;
        } else if (choice == 1 && secondChoice.equals("no")){
            price = 5.45;
        } else if (choice == 2 && secondChoice.equals("no")){
            price = 8.95;
        } else {
            System.out.println("Invalid input");
            return;
        }


        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        // Apply the correct discount
        if (age <= 17){
            price = price * 0.90;
        } else if (age >= 65){
            price = price * 0.80;
        }
        // Print final price with 2 decimal places
        System.out.printf("Your price is $%.2f%n", price);
    }
}