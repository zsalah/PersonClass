package MainPackage;

public class Person {
	
	private String name;
	private String address;
	private String phoneNumber;
	private String email;

	public Person(String name, String address, String phoneNumber, String email) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	
	}
	 /**
	  * @param name the name to set
	  */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}



	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		
		return this.getClass().getName() + name;
		
	}

}
