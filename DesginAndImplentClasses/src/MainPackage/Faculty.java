package MainPackage;

public class Faculty extends Employee{
	
	private String officeHours;
	private String rank;

	public Faculty(String name, String address, String phoneNumber, String email) {
		super(name, address, phoneNumber, email);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the officeHours
	 */
	public String getOfficeHours() {
		return officeHours;
	}

	/**
	 * @param officeHours the officeHours to set
	 */
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		
		return this.getClass().getName() + getName();
	}

}
