package org.example.test;

public class Hello {

    public static void main (String[] args){
        System.out.println("Hello, Rodrigo");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an aline");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        //Here we are seeing the AND operator
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Great then second top score and less than 100");
        }

        //Here we are seeing the OR operator
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        //Here we are seeing the TERNARY operator
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double var1 = 20.00d;
        double var2 = 80.00d;

        double sume = (var1 + var2) * 100.00d;

        double remainder = sume % 40.00d;

        boolean var3 = (remainder == 0.00d) ? true : false;
        System.out.println(var3);

        if (!var3){
            System.out.println("Got some remainder");
        }

    }

}
