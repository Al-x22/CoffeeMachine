package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = askMlOfWater();
        int milk = askMlOfMilk();
        int coffee = askGramsOfCoffee();
        int wantedCups = askCupsOfCoffee();

        int availableCups = Math.min(Math.min(water/200, milk/50), coffee/15);

        if (wantedCups > availableCups) System.out.println("No, I can make only " + availableCups + " cup(s) of coffee");
        else if (wantedCups < availableCups)
            System.out.println("Yes, I can make that amount of coffee (and even " + (availableCups - wantedCups) +
                    " more than that)");
        else System.out.println("Yes, I can make that amount of coffee");


    }
    public static int askQuestion(String question){
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
    public static int askMlOfWater(){
        return askQuestion("Write how many ml of water the coffee machine has:");
    }
    public static int askMlOfMilk(){
        return askQuestion("Write how many ml of milk the coffee machine has:");
    }
    public static int askGramsOfCoffee(){
        return askQuestion("Write how many grams of coffee beans the coffee machine has:");
    }

    public static int askCupsOfCoffee(){
        return askQuestion("Write how many cups of coffee you will need:");

    }
}
