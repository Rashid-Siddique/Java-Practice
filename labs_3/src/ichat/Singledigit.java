package ichat;

public class Singledigit {
	public static void main(String[] args) {
		int num = 38154;
		int sum = 0;
		
		while (num > 9) {
			sum = 0;
			
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
	
		}
		num = sum;
		}
		
		System.out.println(num);
	}

}
