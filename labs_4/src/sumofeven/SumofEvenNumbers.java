package sumofeven;
import java.util.ArrayList;
public class SumofEvenNumbers {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(42);
		numbers.add(17);
		
		int sum = 0;
		
		for(Integer num : numbers) {
			
		
		
		if(num % 2 == 0) {
			sum = sum + num;
		}
	}
		System.out.println("Sum of even numbers = " + sum);

}
}
