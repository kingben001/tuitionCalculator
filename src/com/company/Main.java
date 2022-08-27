package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many credits are you taking?");
        double credits = keyboard.nextDouble();
        System.out.println("Are you an in state student?");
        String inState = keyboard.next();

        if (inState.equalsIgnoreCase("yes")){
            double total = credits *100;
            System.out.println("Your total is: $" +total);
        }
        else if (inState.equalsIgnoreCase("no")){
            double total = credits *200;
            System.out.println("Your total is: $" +total);
        }
    }
}
