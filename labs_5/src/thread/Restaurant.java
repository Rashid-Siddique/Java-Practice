package thread;

public class Restaurant {
	
	private String order;

    private boolean orderPlaced = false;
    private boolean foodReady = false;
    
    public synchronized void foodOrder(String orderName){
    	 order = orderName;

         System.out.println("Waiter received order : " + order);

         orderPlaced = true;

         notifyAll();
    }

    public synchronized void cookedOrder(String orderName){
    	
    	while (!orderPlaced){
    		try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Chef has received the order : " + order);
        System.out.println("The cooking is under process...");

        foodReady = true;

        notifyAll();

    }

    public synchronized void recivedOrder(String orderName){
    	
    	 while(!foodReady){
    	        try{
    	            wait();
    	        }
    	        catch (InterruptedException e)
    	        {
    	            e.printStackTrace();
    	        }
    	    }

    	    System.out.println("Customer received the order : " + order);
    }
}
