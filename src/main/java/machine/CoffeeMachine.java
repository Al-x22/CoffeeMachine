package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        AskCupsOfCoffee();
    }
    public static void AskCupsOfCoffee(){
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        String[] instructions = {
                "For 25 cups of coffee you will need:",
                (cups * 200) + " ml of water",
                (cups * 50) + "ml of milk",
                (cups * 15) + "g of coffee beans",
        };
        for (String instruction : instructions) {
            System.out.println(instruction);
        }

    }
}
