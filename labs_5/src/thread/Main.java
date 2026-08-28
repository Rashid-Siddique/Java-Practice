package thread;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Thread customer = new Thread(new Customer(restaurant), "customer");
        Thread cook = new Thread(new Cook(restaurant), "cook");
        Thread waiter = new Thread(new Waiter(restaurant), "waiter");

        customer.start();
        cook.start();
        waiter.start();
    }
}