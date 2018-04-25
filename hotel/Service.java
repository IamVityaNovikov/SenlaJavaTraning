package senla.hotel;

public class Service {
	
	private String name;
	private int price;
	
	public Service(String name, int price) {
		this.name = new String(name);
		this.price = price;
	}
	
	public int GetPrice() {
		return price;
	}
	
	public String GetName() {
		return (new String(name));
	}

}
