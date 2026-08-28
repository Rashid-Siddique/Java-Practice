package thread;

public class Customer implements Runnable {

    Restaurant restaurant;

    public Customer(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.recivedOrder("Pizza");
    }
}