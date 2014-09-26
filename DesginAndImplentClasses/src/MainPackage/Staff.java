package MainPackage;

public class Staff extends Employee {
	
	private String title;

	public Staff(String name, String address, String phoneNumber, String email) {
		super(name, address, phoneNumber, email);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		
		return this.getClass().getName() + getName();
	}
	

}
