
public class Watch {
	private int rating;
	private Movie movie;
	private Person1 person;
	
	/**
		Constructor
		@param rating The rating of the movie.
		@param person The person watches  the movie.
		@param movie The movie.
	*/
	
	public Watch (int rating,Person1 person, Movie movie) {
		this.rating = rating;
		this.person = person;
		this.movie = movie;
		person.addRating(this);
		movie.addRating(this);
	}
	
	public Person1 getPerson() {
		return person;
	}
	
	public Movie getMovie() {
		return movie;
	}
}
