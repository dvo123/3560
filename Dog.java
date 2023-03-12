import java.util.ArrayList;
import java.util.List;

public class Dog {
	private String breed, name;
	private List<Paw> listPaws;
	
	/**
		This constructor sets a dog must have 4 paws.
	 */

	public Dog () {
		listPaws = new ArrayList<Paw>();
		listPaws.add(new Paw(1, this));
		listPaws.add(new Paw(2, this));
		listPaws.add(new Paw(3, this));
		listPaws.add(new Paw(4, this));
	}
	@Override
	public String toString() {
		return name + ": " + breed;
	}
}
