
public class Room {

	int id;
	int price;
	int stars;
	int capacity;
	String about;
	boolean isAvailable;

	Room(int id, int price, int stars, int capacity, String about) {
		this.id = id;
		this.price = price;
		this.stars = stars;
		this.capacity = capacity;
		this.about = new String(about);
		isAvailable = true;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
	int getCapacity() {
		return capacity;
	}
	
	boolean isReady() {
		return isAvailable;
	}
	
	void open() {
		isAvailable = true;
	}
	
	void close() {
		isAvailable = false;
	}
	
	int getId() {
		return id;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(id);
		sb.append(" - price:");
		sb.append(price);
		sb.append(" stars:");
		sb.append(stars);
		sb.append(" - capacity:");
		sb.append(capacity);
		sb.append(" status:");
		if (isAvailable) {
			sb.append("Available");
		} else {
			sb.append("not Available");
		}
		sb.append("\n");
		sb.append(about);
		return(sb.toString());
	}
}
