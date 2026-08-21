package oop;

abstract public class Vaccine {
	
	int age;
	String nationality;
	boolean firstDoseTaken = false;
	
	public Vaccine(int age, String nationality) {
		
		this.age = age;
		this.nationality = nationality;
		
	}
	
	public void firstDose() {
		
		if (nationality.equals("Indian") && age >= 18) {
		
		System.out.println("Eligible" );
		System.out.println("Pay Rs 250");
		firstDoseTaken = true;
	
	   }else 
	{
			System.out.println("Not Eligible");
		}
	}
	
	public void secondDose() {
		
		if(firstDoseTaken == true) {
			
			System.out.println("Eligible for Second Dose");
			
		}
		else
		{
			System.out.println("Take First Dose First");
		}
		
	}
	
	abstract public void boosterDose();

	}

