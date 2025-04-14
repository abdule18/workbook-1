package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How many hour did you worked? ");
        double hours = scanner.nextDouble();

        System.out.print("What is your hourly pay? ");
        double pay = scanner.nextDouble();

        double grossIncome = (pay * hours) * 52;

        System.out.println(name);
        System.out.println(grossIncome);

    }
}