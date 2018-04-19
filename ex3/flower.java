package senla.tsk3.ex3;

public class flower {
	
	protected String name;
	protected int price;

	public flower() {
		name = new String("Flower");
		price = 20;
		
	}
	
	public String getName() {
			return name;
	}
	
	public int GetPrice() {
		return price;
	}
	
	public void SetPrice(int newPrice) {
		price = newPrice;
	}
	
	public String GetInfo() {
		String res = new String();
		res = name.concat(" ").concat(String.valueOf(price));
		return(res);
	}

}
