package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How many hour did you worked? ");
        float hours = scanner.nextFloat();

        System.out.print("What is your hourly pay? ");
        double pay = scanner.nextDouble();

        double grossIncome = (pay * hours) * 52;

        double grossPay;

        if (hours <= 40){
            grossPay = hours * pay;
        } else {
            float overtimeHours = hours - 40;
            double basePay = 40 * pay;
            double overtimeRate = pay * 1.5;
            double overtimePay = overtimeHours * overtimeRate;

            grossPay = basePay + overtimePay;

        }

        System.out.println(grossPay);
        System.out.println(name);
        System.out.println(grossIncome);

    }
}