import java.util.ArrayList;
import java.util.List;

public class Person1 {
	private String name;
	private List<Watch> listWatch;

	/**
		Constructor
		@param name The name of the person.
	 */
	public Person1(String name) {
		this.name = name;
	}
	
	public void addRating(Watch rate) {
		listWatch = new ArrayList<Watch>();
	}
	
	public List<Movie> getMovies() {
		List<Movie> listMovies = new ArrayList<Movie>();
		for (Watch rate : listWatch) {
			listMovies.add(rate.getMovie());
		}
		return listMovies;
	}
	
	@Override
	public String toString() {
		return name;
	}
}