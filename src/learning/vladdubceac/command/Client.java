package learning.vladdubceac.command;

public class Client {

    public static void main(String[] args) {
        // creating the receiver
        Stock myStock = new Stock();

        // creating the commands
        Order buyStockOrder = new BuyStock(myStock);
        Order sellStockOrder = new SellStock(myStock);

        // Creating invoker and associate it with commands
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
