
public class Service {
	
	int id;
	String name;
	int price;
	
	Service(int id,String name,int price){
		this.id = id;
		this.name = new String(name);
		this.price = price;
	}
	
	String getName() {
		return new String(name);
	}
	
	int getPrice() {
		return price;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getId() {
		return id;
	}
}
