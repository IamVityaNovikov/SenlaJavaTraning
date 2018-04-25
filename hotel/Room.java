package senla.hotel;

public class Room {
	private int price;
	private int stars;
	private int capacity;
	private String about;
	private boolean isReady;
	private Guests guests;
	
	public Room(int price, int capacity, int stars,String about) {
		if (stars<0) {
			stars = 0;
		}
		if (capacity<1) {
			capacity=1;
		}
		if (price<0) {
			price = 0;
		}
		
		this.price = price;
		this.stars = stars;
		this.capacity = capacity;
		this.about = new String(about);
		isReady = true;
	}
	
	public int GetPrice() {
		return price;
	}
	
	public int GetStar() {
		return stars;
	}
	
	public int GetCapacity() {
		return capacity;
	}
	
	public void ChangePrice(int newPrice) {
		price = newPrice;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Price: ");
		sb.append(price);
		sb.append(" Stars: ");
		sb.append(stars);
		sb.append(" Capacity: ");
		sb.append(capacity);
		if (isReady) {
			sb.append(" Ready");
		} else {
			sb.append(" Not Ready");
		}
		sb.append("\nAbout: ");
		sb.append(about);
		return sb.toString();
	}
	
	public void AddGuests(Guests guests) {
		if (guests.GetSize()>capacity) {
			System.out.println("Too many people!");
		}else {
			this.guests = guests;
		}
	}
	
	public void FreeRoom() {
		guests = null;
	}
	
	public boolean isAvailable() {
		return(isReady && (guests==null));
	}
	
	
}
