
public class Professor1 extends Employee {
	private String field;
	
	/**
		Default Constructor calls the super class Employee.
	 */
	
	public Professor1() {
		super();
	}
	
	/**	
		Constructor
		@param name The name of the professor.
	 */
	
	public Professor1(String name) {
		super(name);
	}
	
	/**	
		Constructor
		@param name The name of the professor.
		@param hours the hours of the professor worked.
		@param field The field of the professor.
	 */
	
	public Professor1(String name, int hours, String field) {
		super(name,hours);
		this.field = field;
	}
	
	/**
		This Constructor calculates the Salary.
	 */
	
	@Override
	public double calculateSalary() {
		return super.getHours()*30;
	}
	
	@Override
	public String toString() {
		return getName() + ": " + getHours() + ", " + field;
	}
}
