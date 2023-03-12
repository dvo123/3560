import java.util.ArrayList;
import java.util.List;

public class Magazine implements SaleableItem {
	private List<String> listItems;
	
	public  Magazine() {
		this.listItems = new ArrayList<String>();
	}
	@Override
	public void sellCopy () {
		 System.out.println(toString());
	}
	
	@Override
	public String toString () {
		 return "Selling " + listItems;
	}
}
