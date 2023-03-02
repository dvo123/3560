/**
   This program demonstrates the Student class'
   constructor.
*/

public class StudentTest {
	public static void main(String[] args) {
		// Create a Student's object, passing John, CS, and 3.5 to the constructor.
		Student student1 = new Student("John", "CS", 3.5);

		// Display the student's name, major, and gpa.
	    System.out.println(student1);
	    
	    // Create a Student's object without passing anything
	    Student student2 = new Student();
	    
	    //Set student2's name, major, and gpa using setName, setMajor, and set Gpa.
	    student2.setName("Marry");
	    student2.setMajor("CE");
	    student2.setGpa(3.3);
	    
		// Display the student's name, major, and gpa.
	    System.out.println(student2);
	 
	}
}
