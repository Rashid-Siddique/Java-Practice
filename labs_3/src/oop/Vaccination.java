package oop;
import java.util.Scanner;

public class Vaccination {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Nationality: ");
		String nationality = sc.nextLine();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		VaccinationSuccessful obj = new VaccinationSuccessful(age, nationality);

		obj.firstDose();
		obj.secondDose();
		obj.boosterDose();
		
		sc.close();
		
	}

	
	}

