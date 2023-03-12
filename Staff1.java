
public class Staff1 extends Employee{
	private int role;
	
	/**
		Default Constructor calls the super class Employee.
	 */

	public Staff1() {
		super();
	}
	
	/**	
	Constructor
		@param name The name of the staff.
	 */

	public Staff1(String name) {
		super(name);
	}
	
	/**	
		Constructor
		@param name The name of the staff.
		@param hours the hours of the staff worked.
		@param role The number of role of the staff.
	 */
	
	public Staff1(String name, int hours, int role) {
		super(name, hours);
		this.role = role;
	}
	
	@Override
	public String toString() {
		return getName() + ": " + getHours() + ", " + role;
	}
}
