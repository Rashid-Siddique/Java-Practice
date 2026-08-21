package payment;
import java.util.Scanner;

public class PaymentDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount: ");
		double amount = sc.nextDouble();
		
		UPIPayment upi = new UPIPayment();
		upi.pay(amount);
		
		CreditCardPayment cc = new CreditCardPayment();
		cc.pay(amount);
		
		DebitCardPayment dc = new DebitCardPayment();
		dc.pay(amount);
		
		sc.close();
	}

}
