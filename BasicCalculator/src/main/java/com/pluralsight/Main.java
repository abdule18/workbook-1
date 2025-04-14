package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        int multiply = first * second;

        System.out.print("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide");
        String calculation = scanner.nextLine();

        System.out.print("Please select an option:");
        String option = scanner.nextLine();
        System.out.println(first + " * " + second + " = " + multiply);

    }
}
