
public class Worker {
	private String name;
	private double hourlyRate;
	
	/**
		Constructor
		@param name The name of the worker.
		@param hourlyRate The working hour rate of the worker.
	*/
	
	public Worker(String name, double hourlyRate) {
		this.name= name;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public String toString() {
		return name + ": " + hourlyRate;
	}
	
}
