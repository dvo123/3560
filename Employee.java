
public abstract class Employee {
	private String name;
	private int hours;
	
	/**
		Default Constructor.
	 */
	
	public Employee() {
	}
	
	/**
		Constructor
		@param name The name of the employee.
	 */
	public Employee(String name) {
		this.name = name;
	}
	
	/**	
		Constructor
		@param name The name of the employee.
		@param hours the hours of the employee worked.
	 */
	
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	/**
		This Constructor calculates the Salary.
	 */
	
	public double calculateSalary() {
		return hours*20;
	}
	
	/**
		This Constructor returns name String type.
	 */
	
	public String getName() {
		return name;
	}
	
	/**
		This Constructor returns hours int type.
	 */
	
	public int getHours() {
		return hours;
	}
	
	@Override
	public String toString() {
		return name + ": " + hours + " hours";
	}
}
