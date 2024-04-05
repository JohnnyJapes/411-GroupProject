package psu.edu.groupProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//Luke Hanrahan
//IST411
//Group Project
@Entity
@Table(name="employeedatatable")
public class Employee {
//names left as they are in the table
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Employee_ID")
	private int id;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;

	@Column(name="Start_date")
	private String startDate;

	@Column(name="Start_Salary")
	private int startSalary;
	
	@Column(name="Employee_Contract_Signed")
	private char contract;
	
	@Column(name="Social_Security_Number")
	private String ssn;
	
	@Column(name="Birthdate")
	private String birthdate;

	@Column(name="Phone_Number")
	private String phoneNumber;

	@Column(name="Emergency_Contact_Name")
	private String emergencyContact;

	@Column(name="Emergency_Contact_Phone")
	private String emergencyContactPhone;
	//define constructor
	public Employee() {}


	public Employee(int id, String firstName, String lastName, String startDate, int startSalary, char contract, String ssn, String birthdate, String phoneNumber, String emergencyContact, String emergencyContactPhone) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.startDate = startDate;
		this.startSalary = startSalary;
		this.contract = contract;
		this.ssn = ssn;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
		this.emergencyContact = emergencyContact;
		this.emergencyContactPhone = emergencyContactPhone;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getStartSalary() {
		return this.startSalary;
	}

	public void setStartSalary(int startSalary) {
		this.startSalary = startSalary;
	}

	public char getContract() {
		return this.contract;
	}

	public void setContract(char contract) {
		this.contract = contract;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmergencyContact() {
		return this.emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEmergencyContactPhone() {
		return this.emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}


	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", firstName='" + getFirstName() + "'" +
			", lastName='" + getLastName() + "'" +
			", startDate='" + getStartDate() + "'" +
			", startSalary='" + getStartSalary() + "'" +
			", contract='" + getContract() + "'" +
			", ssn='" + getSsn() + "'" +
			", birthdate='" + getBirthdate() + "'" +
			", phoneNumber='" + getPhoneNumber() + "'" +
			", emergencyContact='" + getEmergencyContact() + "'" +
			", emergencyContactPhone='" + getEmergencyContactPhone() + "'" +
			"}";
	}
	
}

	