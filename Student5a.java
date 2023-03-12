
public class Student5a {
	private String name;
	private Transcript transcript;
	
	/**
	 This constructor forces the user to create a name
	 that has to link  to an address.
	
	 */
	public Student5a (String name, Transcript transcript) {
		this.name = name;
		this.transcript = transcript;
	}
	@Override
	public String toString() {
		return name;
	}
}
