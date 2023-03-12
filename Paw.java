
public class Paw {
	private int position;
	private Dog dog;
	
	public Paw (int position, Dog dog) {
		this.position = position;
		this.dog = dog;
	}
	@Override
	public String toString() {
		return String.valueOf(position);
	}
}
