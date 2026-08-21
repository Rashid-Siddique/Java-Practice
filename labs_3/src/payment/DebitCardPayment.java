package payment;

public class DebitCardPayment implements Payment{

	@Override
	public void pay(double amount) {
		
		System.out.println("Debit Card Payment Successful");
		System.out.println("Amount Paid: Rs. " + amount);
		
	}

}
