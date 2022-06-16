import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		
		 // Objects 
		Project one = new Project(null, null, null, null, null, 0, 0, null);
		Person contractorOne = new Person(null, null, null, null, null);
		
		System.out.println("Please enter new project details:");
		
		// Create project object.
		System.out.println("Please enter project number:");
		Scanner input = new Scanner(System.in);
		String projectNumber = input.nextLine();
		one.setProjectNumber(projectNumber);
		one.getProjectNumber();
		
		System.out.println("Please enter project name:");
		String projectName = input.nextLine();
		one.setProjectName(projectName);
		one.getProjectName();
		
		System.out.println("Please enter building type:");
		String buildingType = input.nextLine();
		one.setBuildingType(buildingType);
		one.getBuildingType();
				
		System.out.println("Please enter the address:");
		String address = input.nextLine();
		one.setAddress(address);
		one.getAddress();
		
		System.out.println("Please enter the ERF number:");
		String erfNumber = input.nextLine();
		one.setErfNumber(erfNumber);
		
		System.out.println("Please enter Project Fee:");
		double projectFee = input.nextDouble();
		one.setProjectFee(projectFee);
		
		System.out.println("Please enter payment received:");
		double projectPaid = input.nextDouble();
		one.setProjectPaid(projectPaid);
		
		System.out.println("Please enter the completion date:");
		String projectDeadline = input.next();
		one.setProjectDeadline(projectDeadline);
		
		
		// Print Project object to user. 
		System.out.println(one.toString());
		
		
		// Add customer details as an object of Person class.
		// Later project// 	
		
		
		
		// Add contractor details as an Object of Person class.
		System.out.println("Please add Contractor name:");
		String name = input.next();
		contractorOne.setName(name);
		contractorOne.getName();
		
		
		contractorOne.setTitle("Contractor");
		
		String title = "Contractor";
		contractorOne.setTitle(title);
		contractorOne.getTitle();
		
		System.out.println("Please enter Contractor Phone number:");
		String phoneNumber = input.next();
		contractorOne.setPhoneNumber(phoneNumber);
		contractorOne.getPhoneNumber();
		
		System.out.println("Please enter Contractor Email");
		String emailAddress = input.next();
		contractorOne.setEmailAddress(emailAddress);
		contractorOne.getEmailAddress();
		
		System.out.println("Please add contractor Address:");
		String addressPerson = input.next();
		contractorOne.setAddressPerson(addressPerson);
		contractorOne.getAddressPerson();
		
		
		// Print to user.
		System.out.println(contractorOne.toString());
		
				
		// Add architect details.
		// Later Project//
		
		
		// Change project object attributes where appropriate and print to user. 
		System.out.println("Please enter a new completion date:");
		Scanner inputDate = new Scanner(System.in);
		String newDeadline = inputDate.nextLine();
		one.setProjectDeadline(newDeadline);
		System.out.println(one.toString());
		
		System.out.println("Please enter Fee paid to date:");
		Scanner inputFee = new Scanner(System.in);
		double updatedFee = inputFee.nextDouble();
		one.setProjectFee(updatedFee);
		
		
		// Edit Person object attributes and print to user.
		System.out.println("Please Update Contractors details, Contractor's name:");
		Scanner inputContractor = new Scanner(System.in);
		String newName = inputContractor.nextLine();
		contractorOne.setName(newName);
		

			
		System.out.println("Please update Contractor's phone number:");
		String newNumber = inputContractor.nextLine();
		contractorOne.setPhoneNumber(newNumber);
		
		System.out.println("Please update Contractor's email:");
		String newEmail = inputContractor.nextLine();
		contractorOne.setEmailAddress(newEmail);
		
		System.out.println(contractorOne.toString());
		
		
		// Finalise project and print to user.
		System.out.println("\n");
		System.out.println("\tProject: ");
		System.out.println("_______________________");
		System.out.println(one.toString());
		System.out.println("\tContractor: ");
		System.out.println("_______________________");
		System.out.println(contractorOne.toString());
		System.out.println("_______________________");
		
	}
		
	
	
} 

