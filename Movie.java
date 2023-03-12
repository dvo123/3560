import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String name, genre;
	private List<Watch> listWatch;
	
	/**
		Constructor
		@param name The name of the person.
	*/
	
	public Movie(String name) {
		this.name = name;
	}
	
	/**
		Constructor
		@param name The name of the movie.
		@param genre The genre of the movie.
	*/
	
	public Movie(String name, String genre) {
		this.name = name;
		this.genre = genre;
	}
	
	public void addRating (Watch rate) {
		if (listWatch == null) {
			listWatch = new ArrayList<Watch>();
		}
		listWatch.add(rate);
	}
	
	public List<Person1> getPerson() {
		List<Person1> listPerson = new ArrayList<Person1>();
		for (Watch rate : listWatch) {
			listPerson.add(rate.getPerson());
		}
		return listPerson;
	}
}
