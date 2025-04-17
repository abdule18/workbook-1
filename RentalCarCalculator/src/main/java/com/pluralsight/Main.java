package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Pick Up date: Exp:(04-15-2025) " );
        String pickUpDate = scanner.nextLine();

        System.out.print("How many days are you renting? ");
        int numDays = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Would you want an electronic toll tag for $3.95/day (yes/no)?");
        String tollTage = scanner.nextLine();

        System.out.println("Would you want a GPS for $2.95/day (yes/no)? ");
        String gps = scanner.nextLine();

        System.out.print("Would you want to add roadside assistance for $3.95/day (yes/no)? ");
        String roadsideAssistance = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        double tollCost = 0;
        double gpsCost = 0;
        double roadsideCost = 0;
        double basicCarRental = 29.99 * numDays;

        switch (tollTage.toLowerCase()){
            case "yes":
                tollCost = 3.95  * numDays;
                break;
            case "no":
                tollCost = 0;
                break;
            default:
                System.out.println("Invalid Input for toll tag");
        }

        switch (gps.toLowerCase()){
            case "yes":
                gpsCost = 2.95  * numDays;
                break;
            case "no":
                tollCost = 0;
                break;
            default:
                System.out.println("Invalid Input for GPS");
        }

        switch (roadsideAssistance.toLowerCase()){
            case "yes":
                roadsideCost = 3.95  * numDays;
                break;
            case "no":
                tollCost = 0;
                break;
            default:
                System.out.println("Invalid Input for GPS");
        }

        double optionalCost = tollCost + gpsCost + roadsideCost;
        double surcharge = 0;

        if (age < 25){
            surcharge = basicCarRental * 0.30;
        }
        double totalCost = basicCarRental +  optionalCost + surcharge;

        System.out.println("The cost of your basic Car rental price is $" + basicCarRental);
        System.out.println("The cost of your Optional cost is $" + optionalCost);
        System.out.println("The cost of your surcharge is $" +  surcharge);
        System.out.println("The total cost is $" + totalCost);




    }
}