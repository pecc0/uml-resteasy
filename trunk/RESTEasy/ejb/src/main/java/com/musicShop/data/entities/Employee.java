package com.musicShop.data.entities;

/**
 * That is an employee in the system.
 */
@javax.xml.bind.annotation.XmlRootElement(name = "entity")
public class Employee {
	private String firstName = "";
	private String secondName = "";
	private String lastName = "";
	private long telephoneNummber;
	private String address = "";
	private long EGN;
	private int salary;

	public void setFirstName(String aFirstName) {
		this.firstName = aFirstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setSecondName(String aSecondName) {
		this.secondName = aSecondName;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public void setLastName(String aLastName) {
		this.lastName = aLastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setTelephoneNummber(long aTelephoneNummber) {
		this.telephoneNummber = aTelephoneNummber;
	}

	public long getTelephoneNummber() {
		return this.telephoneNummber;
	}

	public void setAddress(String aAddress) {
		this.address = aAddress;
	}

	public String getAddress() {
		return this.address;
	}

	public void setEGN(long aEGN) {
		this.EGN = aEGN;
	}

	public long getEGN() {
		return this.EGN;
	}

	public void setSalary(int aSalary) {
		this.salary = aSalary;
	}

	public int getSalary() {
		return this.salary;
	}
}