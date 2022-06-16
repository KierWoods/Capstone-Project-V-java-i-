
public class Person {

	// Attributes of Person class.
	private String title; 
	private String name;
	private String addressPerson;
	private String phoneNumber;
	private String emailAddress;
	
	
	
	
	// Methods.
		public String getTitle() {
			return title;
		}
		public void setTitle(String title){
			this.title = title;
		}
		public String getName() {
			return name;
		}
		public void setName(String newName) {
			this.name = newName;
		}
		
		public String getAddressPerson() {
			return addressPerson;
		}
		public void setAddressPerson(String newAddress) {
			this.addressPerson = newAddress;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String newPhoneNumber) {
			this.phoneNumber = newPhoneNumber; 
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String newEmail) {
			this.emailAddress = newEmail;
		}
		public String toString() {
			String output = "Name: " + name;
			output += "\nTitle: "+ title;
			output += "\nPhone No: " + phoneNumber;
			output += "\nEmail: " + emailAddress;
			output += "\nAddress: " + addressPerson;
			return output;
		}

	
	// Constructor.	
	public Person (String name, String title, String phoneNumber, String emailAddress, String addressPerson) {
			
	this.title = title;
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.emailAddress = emailAddress;
	this.addressPerson = addressPerson;
	}
	
	class Customer extends Person {

		public Customer(String name, String title, String phoneNumber, String emailAddress, String address) {
			super(name, title, phoneNumber, emailAddress, address);
				
		}
			// Attributes of Person class.
			private String title; 
			private String name;
			private String addressPerson;
			private String phoneNumber;
			private String emailAddress;
			
			
			
			
			// Methods.
				public String getTitle() {
					return title;
				}
				public void setTitle(String newTitle){
					this.title = newTitle;
				}
				public String getName() {
					return name;
				}
				public void setName(String newName) {
					this.name = newName;
				}
				
				public String getAddressPerson() {
					return addressPerson;
				}
				public void setAddressPerson(String newAddress) {
					this.addressPerson = newAddress;
				}
				public String getPhoneNumber() {
					return phoneNumber;
				}
				public void setPhoneNumber(String newPhoneNumber) {
					this.phoneNumber = newPhoneNumber; 
				}
				public String getEmailAddress() {
					return emailAddress;
				}
				public void setEmailAddress(String newEmail) {
					this.emailAddress = newEmail;
				}
				public String toString() {
					String output = "Name: " + name;
					output += "\nTitle: "+ title;
					output += "\nPhone No: " + phoneNumber;
					output += "\nEmail: " + emailAddress;
					output += "\nAddress: " + addressPerson;
					return output;
				
				}
		}
		class Contractor extends Person{

			public Contractor(String name, String title, String phoneNumber, String emailAddress, String addressPerson) {
				super(name, title, phoneNumber, emailAddress, addressPerson);
				
			}
			// Attributes of Person class.
						private String title; 
						private String name;
						private String addressPerson;
						private String phoneNumber;
						private String emailAddress;
						
						
						
						
						// Methods.
							public String getTitle() {
								return title;
							}
							public void setTitle(String newTitle){
								this.title = newTitle;
							}
							public String getName() {
								return name;
							}
							public void setName(String newName) {
								this.name = newName;
							}
							
							public String getAddressPerson() {
								return addressPerson;
							}
							public void setAddressPerson(String newAddress) {
								this.addressPerson = newAddress;
							}
							public String getPhoneNumber() {
								return phoneNumber;
							}
							public void setPhoneNumber(String newPhoneNumber) {
								this.phoneNumber = newPhoneNumber; 
							}
							public String getEmailAddress() {
								return emailAddress;
							}
							public void setEmailAddress(String newEmail) {
								this.emailAddress = newEmail;
							}
							public String toString() {
								String output = "Name: " + name;
								output += "\nTitle: Contractor";
								output += "\nPhone No: " + phoneNumber;
								output += "\nEmail: " + emailAddress;
								output += "\nAddress: " + addressPerson;
								return output;
							
							}
					}
		}
	
