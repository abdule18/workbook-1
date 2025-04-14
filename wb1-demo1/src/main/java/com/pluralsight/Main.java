package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String word1 = "Hello";

        String word2 = "World";

        String greeting;

        greeting =  word1 + " " + word2 + "!";

        System.out.println(greeting);

        /////////////////////////////////////////////

        float taxRate = 0.15f;

        long aLargeNum = 22255554444L;

        /////////////////////////////////////////////
        int aint;
        long bLong;

        aint = 7;

        bLong = aint;

        /////////////////////////////////////////////
         long aLong;
         int bInt;

         aLong = 7_000_000_0000L;
         bInt = (int) aLong;

    }
}