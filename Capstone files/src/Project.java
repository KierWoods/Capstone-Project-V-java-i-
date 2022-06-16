
public class Project {
		
	// Project attributes.
	private String projectNumber;
	private String projectName;
	private String buildingType;
	private String address;
	private String erfNumber;
	private double projectFee;
	private double projectPaid;
	private String projectDeadline;
	
	// Methods, getters and setters.
	public String getProjectNumber() {
		return projectNumber;
	}
	public void setProjectNumber(String newProjectNumber) {
		this.projectNumber = newProjectNumber;
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String newProjectName) {
		this.projectName = newProjectName;
	}
	public String getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(String newBuildingType) {
		this.buildingType = newBuildingType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	public String getErfNumber() {
		return erfNumber;
	}
	public void setErfNumber(String newErfNumber) {
		this.erfNumber = newErfNumber;
	}
	public double getProjectFee() {
		return projectFee;
	}
	public void setProjectFee(double newProjectFee) {
		this.projectFee = newProjectFee;
	}
	public double getProjectPaid() {
		return projectPaid;
	}
	public void setProjectPaid(double newProjectPaid) {
		this.projectPaid = newProjectPaid;
	}
	public String getProjectDeadline() {
		return projectDeadline;
	}
	public void setProjectDeadline(String newDeadline) {
		this.projectDeadline = newDeadline;
	}
	public String toString() {
		String output = "Project no: " + projectNumber;
		output += "\nProject: " + projectName;
		output += "\nType: " + buildingType;
		output += "\nAddress: " + address;
		output += "\nERF Number: " + erfNumber;
		output += "\nProject Fee: " + projectFee;
		output += "\nPayment Received: " + projectPaid;
		output += "\nCompletion Date: " + projectDeadline;
		return output;
		
	}
	
	// Constructor.
	
	public Project(String projectNumber, String projectName, String buildingType, String address, String erfNumber, double projectFee, double projectPaid, String projectDeadline) {
			
	this.projectNumber = projectNumber;
	this.projectName = projectName;
	this.buildingType = buildingType; 
	this.address = address;
	this.erfNumber = erfNumber;
	this.projectFee = projectFee;
	this.projectPaid = projectPaid;
	this.projectDeadline = projectDeadline;
	}
	
	
	
	
}
