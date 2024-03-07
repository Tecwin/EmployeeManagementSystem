package com.project.EmployeeManagementApp.DTO;

import java.util.Date;

public class EmployeeDTO {

	private Integer EmployeeID;
	private String FirstName;
	private String LastName;
	private String Password;
	private Integer PhoneNo;
	private Date HireDate;
	private Date BirthDate;
	private String email;

	public Integer getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		EmployeeID = employeeID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Integer getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(Integer phoneNo) {
		PhoneNo = phoneNo;
	}
	public Date getHireDate() {
		return HireDate;
	}
	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [EmployeeID=" + EmployeeID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Password=" + Password + ", PhoneNo=" + PhoneNo + ", HireDate=" + HireDate + ", BirthDate="
				+ BirthDate + ", email=" + email + "]";
	}

	
	
	
	
}
