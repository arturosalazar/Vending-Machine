import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
        
        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        Machine vending = new Machine(items);

        System.out.println(vending);

        //Set up scanner and request a row and spot from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Pick a row: ");
        int row = scan.nextInt();

        System.out.print("Pick a spot: ");
        int spot = scan.nextInt();

        //Dispense drink at requested row and spot. Then print the machine's current status
        vending.dispense(row, spot);
        System.out.println("\n" + vending);


    
    }
}
