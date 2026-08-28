package thread;

public class Cook implements Runnable {

    Restaurant restaurant;

    public Cook(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.cookedOrder("Pizza");
    }
}