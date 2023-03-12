
public class Transcript {
	private String course;
	private double grade;
	
	public Transcript (String course, double grade) {
		this.course = course;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return course + ", " + grade + ", ";
	}
}
