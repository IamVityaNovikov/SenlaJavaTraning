package senla.tsk3.ex3;

public class flower {
	
	protected static String name = new String("Flower");
	protected static int price = 20;
	
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
