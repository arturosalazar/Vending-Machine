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

        //Set up scanner
        Scanner scan = new Scanner(System.in);

        //Get how much money the user
        System.out.println("How much money do you have?");
        double userMoney = scan.nextDouble();

        //Check if user has enough money to buy the cheapest drink
        if (userMoney < 1.49) {
            System.out.println("I'm sorry, you do not have enough to purchase a drink. Thank you for using Java Drinks");
            System.exit(0);
        }

        while(true){
            //request a row and spot from user
            System.out.print("Pick a row: ");
            int row = scan.nextInt();

            System.out.print("Pick a spot in the row: ");
            int spot = scan.nextInt();

            //Retrieve and store the price of the selected item
            double selectedItemPrice = vending.getItem(row, spot).getPrice();

            //If the user does not have enough money to purchase the item, let user know and ask the user again
            if (selectedItemPrice > userMoney){
                System.out.println("I'm sorry, you don't have enough for that drink, try again");
                continue;
            }

            boolean vendingResult = vending.dispense(row, spot);
            System.out.println("\n" + vending);

            //If the item is available, deduct the cost from the user's money and print a message. Else explain out of item
            if (vendingResult){
                userMoney -= selectedItemPrice;
                System.out.print("\nEnjoy your drink! You now have " + userMoney + " available. Press 1 to purchase another: ");
            } else {
                System.out.print("\nSorry, we're out of this item. You still have " + userMoney + " available. Press 1 to purchase another: ");
            }
            
            if (scan.nextInt() != 1){
                break;
            }
        }

        
        
        

    
    }
}
