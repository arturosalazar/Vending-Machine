public class Main {
    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
        //Test 1 = make sure we can create a new item and print out correctly
        Item pepsi = new Item("Pepsi", 1.99, 3);
        System.out.println(pepsi);

        //Test 2 = make sure we can use copy constructor to make a new item, change the new item's
        //fields (without changing the old item) and print out both the old and new items
        System.out.println("Adding Fresca\n");
        Item fresca = new Item (pepsi);
        fresca.setName("Fresca");
        fresca.setPrice(1.49);
        fresca.setQuantity(10);
        System.out.println("Printing Items:");
        System.out.println(pepsi);
        System.out.println(fresca);


        /* Item[][] items = new Item[][] {
        /     { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
        /     { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
        /     { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        / };
        */
    }
}
