
public class Course1 {
	private int code;
	private Book1 book;
	
	/**
		Default Constructor.
	 */

	public Course1() {
	}
	
	/**
		Constructor
		@param code The code of the book.
	*/
	
	public Course1 (int code) {
		this.code = code;
	}
	
	/**
		Constructor
    	@param code The code of the course.
    	@param book The book for the course.
	
	 */
	public Course1 (int code, Book1 book) {
		this.code = code;
		this.book = book;
	}
	@Override
	public String toString() {
		return String.valueOf(code);
	}
}
