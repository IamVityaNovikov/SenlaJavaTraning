import java.util.ArrayList;
import java.util.List;

public class RoomStore {
	private int idCount;
	private List<Room> rooms;
	
	public RoomStore() {
		idCount = 0;
		rooms  = new ArrayList<Room>();
	}
	
	void add(int price,int stars,int capacity,String about) {
		rooms.add(new Room(idCount,price,stars,capacity,about));
		idCount++;
	}
	Room getById(int id) {
		int n = rooms.size();
		if(n>0) {
			for(int i = 0;i<n;i++) {
				if(rooms.get(i).getId()==id) {
					return rooms.get(i);
				}
			}
		}
		return null;		
	}
	
	void remove(int id) {
		for(int i =0;i<rooms.size();i++) {
			if(rooms.get(i).getId()==id) {
				rooms.remove(i);
				break;
			}
		}
	}
	
	int getPrice(int id) {
		Room temp = getById(id);
		if(temp!=null) {
			return temp.getPrice();
		}
		return 0;
	}
	
	String toString(int id) {
		Room temp = getById(id);
		if(temp!=null) {
			return temp.toString();
		}
		return new String("none");
	}
	
	void close(int id) {
		Room temp = getById(id);
		if(temp!=null) {
			temp.close();
		}
	}

	void open(int id) {
		Room temp = getById(id);
		if(temp!=null) {
			temp.open();
		}
	}
	
	boolean isReady(int id) {
		Room temp = getById(id);
		if(temp!=null) {
			return temp.isReady();
		}
		return false;
	}
	
	int getCapacity(int id) {
		Room temp = getById(id);
		if(temp!=null) {
			return temp.getCapacity();
		}
		return 0;
	}
	
	void setPrice(int id,int price) {
		Room temp = getById(id);
		if(temp!=null) {
			temp.setPrice(price);
		}
	}
	
	int getSize() {
		return rooms.size();
	}
	
}
