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
        
        //Test: Changing outside items[][] array should not change the items[][] array in the machine object
        items[2][1].setPrice(2.99);
        System.out.println("\nExpected Output:  C-Cola: 1.49 (2)");
        System.out.println("Actual Output: " + vending.getItem(2, 1)); //Expected output: C-Cola: 1.49 (2). Incorrect if C-Cola: 2.99 (2)

        //Test: Getting an item from the machine object items[][] array and changing it should not change the item stored in the machine object
        Item testItem = vending.getItem(2, 1);
        testItem.setPrice(2.99);
        System.out.println("\nExpected Output:  C-Cola: 1.49 (2)");
        System.out.println("Actual Output: " + vending.getItem(2, 1)); //Expected output: C-Cola: 1.49 (2). Incorrect if C-Cola: 2.99 (2)

        //Test: using the setItem function should change the value in the items[][] array within the machine object
        vending.setItem(testItem, 2, 1);
        System.out.println("\nExpected Output:  C-Cola: 2.99 (2)");
        System.out.println("Actual Output: " + vending.getItem(2, 1)); //Expected output: C-Cola: 2.99 (2). Incorrect if C-Cola: 1.49 (2)
        

        
    }
}
