package learning.vladdubceac.command;

public class Stock {
    // RECEIVER
    private static final String NAME = "My Receiver";
    private int quantity = 1000;

    public void buy(){
        System.out.println("Stock [ Name: "+NAME+" , Quantity: "+quantity+" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+NAME+" , Quantity: "+quantity+" ] sold");
    }
}
