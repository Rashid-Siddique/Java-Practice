package payment;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		
		System.out.println("Credit Card Payment Successful");
		System.out.println("Amount Paid: Rs. " + amount);
		
	}

}
