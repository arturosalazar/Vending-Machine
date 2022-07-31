public class Item {
    private String name;
    private double price;
    private int quantity;

    //Constructor
    public Item (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Copy Constructor
    public Item (Item source){
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuanity(){
        return this.quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String toString(){
        String output = "" + this.name + ": " + this.price + " (" + this.quantity + ")";
        return output;
    }

}
