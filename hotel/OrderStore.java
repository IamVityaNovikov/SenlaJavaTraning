import java.util.ArrayList;
import java.util.List;

public class OrderStore {
	private int idCount;
	private List<Order> orders;
	
	public OrderStore() {
		idCount = 0;
		orders  = new ArrayList<Order>();
	}
	
	void add(int capacity,int room,int dateIn,int dateOut) {
		orders.add(new Order(idCount,capacity, room, dateIn, dateOut));
		idCount++;
	}
	
	Order getOrder(int id) {
		int n = orders.size();
		for (int i = 0;i<n;i++) {
			if(orders.get(i).getId()==id) {
				return orders.get(i);
			}
		}
		return null;
	}
	
	int[] getGuests(int id) {
		Order temp = getOrder(id);
		if(temp!=null) {
			return temp.getGuests();
		}
		return null;
	}
	
	int getDateOut(int id) {
		Order temp = getOrder(id);
		if(temp!=null) {
			return temp.getDateOut();
		}
		return 0;
	}
	
	void addPerson(int id,int personId) {
		Order temp = getOrder(id);
		if(temp!=null) {
			temp.addPerson(personId);
		}
	}
	
	void remove(int id) {
		int n = orders.size();
		for(int i = 0;i<n;i++) {
			if(orders.get(i).getId()==id) {
				orders.remove(i);
				break;
			}
		}
	}
	
	
}
