package model;

public class Customer {
	
	String Username;
	String Password1;
	String customerName;
	String gender;
	String emailId;
	String mobileNo;
	String address;
	
public Customer() {}
	
	public Customer(String username,String password,String cName,String gender,String emailid,String mobileNo,String address)
	{
		this.Username=username;
		this.Password1=password;
		this.customerName=cName;
		this.gender=gender;
		this.emailId=emailid;
		this.mobileNo=mobileNo;
		this.address=address;
	}
	
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword1() {
		return Password1;
	}

	public void setPassword1(String password1) {
		Password1 = password1;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	

	

}
