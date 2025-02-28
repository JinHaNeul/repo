

import java.util.Scanner;
import java.util.ArrayList;

public class PatientDriverApp {
	
	public static void displayPatient(Patient userPatient) {
		System.out.println("Patient info:");
		System.out.println(userPatient.toString());
	}
	
	public static void displayProcedure(Procedure[] procedures) {
		for (int i = 0; i < 3; i++) {
            System.out.println(procedures[i].toString());
        }
	}
	
	public static double calculateTotalCharges(Procedure[] procedures) {
		double total = 0.0;
		for (int i = 0; i < 3; i++) {
            total += procedures[i].getCharges();
        }
		return total;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Procedure[] procedures = new Procedure[3];
		System.out.print("Enter the first name: ");
		String firstName = input.nextLine();
		System.out.print("Enter the middle name: ");
		String middleName = input.nextLine();
		System.out.print("Enter the last name: ");
		String lastName = input.nextLine();
		System.out.print("Enter the street address: ");
		String streetAddress = input.nextLine();
		System.out.print("Enter the city: ");
		String city = input.nextLine();
		System.out.print("Enter the state: ");
		String state = input.nextLine();
		System.out.print("Enter the zip code: ");
		int zipCode = input.nextInt();
		input.nextLine();
		System.out.print("Enter the phone number: ");
		String phNo = input.nextLine();
		System.out.print("Enter the emergency contact name: ");
		String emergencyName = input.nextLine();
		System.out.print("Enter the emergency contact phone number: ");
		String emergencyPhNo = input.nextLine();
		System.out.println();
		Patient userPatient = new Patient(firstName, middleName, lastName, streetAddress, city, state, phNo, emergencyName, emergencyPhNo, zipCode);
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter the name of the procedure: ");
			String nameProcedure = input.nextLine();
			System.out.print("Enter the date of the procedure: ");
			String date = input.nextLine();
			System.out.print("Enter the name of the practitioner: ");
			String namePractitioner = input.nextLine();
			System.out.print("Enter the charges of the procedure: ");
			double charges = input.nextDouble();
			input.nextLine();
			System.out.println();
			if (i == 0) {
				procedures[i] = new Procedure();
				procedures[i].setNameProcedure(nameProcedure);
				procedures[i].setDate(date);
				procedures[i].setNamePractitioner(namePractitioner);
				procedures[i].setCharges(charges);
			} else if (i == 1) {
				procedures[i] = new Procedure(nameProcedure, date);
				procedures[i].setNamePractitioner(namePractitioner);
				procedures[i].setCharges(charges);
			} else if (i == 2) {
				procedures[i] = new Procedure(nameProcedure, date, namePractitioner, charges);
			}
		}
		displayPatient(userPatient);
		displayProcedure(procedures);
		System.out.println("Total Charges: $" + String.format("%.2f", calculateTotalCharges(procedures)));
		System.out.println();
		System.out.println("Student name: Jin Ha Neul");
		System.out.println("MC#: MC21194970");
		System.out.println("Due Date: 2/27/2025");
	}

}