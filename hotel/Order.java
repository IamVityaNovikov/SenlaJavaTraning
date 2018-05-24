
public class Order {

	int id;
	int people[];
	int room;
	int capacity;
	int dateIn;
	int dateOut;
	private int alreadyIn; //pointer to the next empty element of array of people
	
	Order(int id,int capacity,int room,int dateIn,int dateOut){
		this.id = id;
		this.room = room;
		this.capacity = capacity;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
		people = new int[capacity];
		alreadyIn = 0;
	}
	
	int getId() {
		return id;
	}
	
	void addPerson(int id) {
		people[alreadyIn] = id;
		alreadyIn++;
	}
	
	int getSize() {
		return capacity;
	}
	
	int[] getGuests() {
		return people;
	}
	
	int getDateOut() {
		return dateOut;
	}
	
}
