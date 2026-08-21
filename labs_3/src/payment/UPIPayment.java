package payment;

public class UPIPayment implements Payment{

	@Override
	public void pay(double amount) {
		
		System.out.println("UPI Payment Successful");
		System.out.println("Amount Paid: Rs. " + amount);
	}

}
