
public class Student {
	private String name;
	private String major;
	private double gpa;
	
	/**
    	This constructor sets the student's name and major to
    	"Empty", gpa to 0.0.
	 */

	public Student() {
		name = "Empty";
		major = "Empty";
		gpa = 0.0;
	}
	/**
    	Constructor
    	@param name The name of the student.
    	@param major The major of the student.
	 */

	public Student(String name, String major) {
		this.name = name;
		this.major = major;
	}
 
	/**
 		Constructor
 		@param name The name of the student.
    	@param major The major of the student.
    	@param gpa The gpa of the student.
	*/

	public Student(String name, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}

	/**
    	The setName method stores a value in the
    	name field.
    	@param name The value to store in name.
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
    	The setMajor method stores a value in the
    	major field.
    	@param major The value to store in major.
	 */

	public void setMajor(String major) {
		this.major = major;
	}
	
	/**
		The setGpa method stores a value in the
		gpa field.
		@param gpa The value to store in gpa.
	 */

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	/**
    	The getGpa method returns a Student's gpa.
    	@return The value in the gpa field.
	 */

	public double getGpa() {
		return gpa;
	}

	/**
    	The getName method returns a Student's name.
    	@return The value in the name field.
	 */

	public String getName() {
		return name;
	}

	/**
    	The getMajor method returns a Student's major.
    	@return The value in the major field.
	 */

	public String getMajor() {
		return major;
	}
 
	public String toString() {
		return String.format("Name: %s, Major: %s, GPA: %.2f", name, major, gpa);
	}
 
	public boolean equals(Student student2) {
		boolean status;
    
		if(name == student2.name && major == student2.major)
			status = true;
		else
			status = false;
		return status;
	}
}
