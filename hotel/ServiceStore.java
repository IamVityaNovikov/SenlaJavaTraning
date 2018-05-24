import java.util.ArrayList;
import java.util.List;

public class ServiceStore {

	private int idCount;
	private List<Service> services;
	
	public ServiceStore() {
		idCount = 0;
		services  = new ArrayList<Service>();
	}
	
	void add(String name,int price) {
		services.add(new Service(idCount,name,price));
		idCount++;
	}
	
	void remove(int id) {
		int n = services.size();
		for(int i = 0;i<n;i++) {
			if(services.get(i).getId()==id) {
				services.remove(i);
				break;
			}
		}
	}
	
	Service getById(int id) {
		int n = services.size();
		for(int i = 0;i<n;i++) {
			if(services.get(i).getId()==id) {
				return services.get(i);
			}
		}
		return null;
	}
	
	String getName(int id) {
		Service temp = getById(id);
		if(temp!=null) {
			return temp.getName();
		}
		return new String("");
		
	}
	
	int getPrice(int id) {
		Service temp = getById(id);
		if(temp!= null) {
			return temp.getPrice();
		}
		return 0;
	}
	
	void setPrice(int id,int price) {
		Service temp = getById(id);
		if(temp!=null) {
			temp.setPrice(price);
		}
	}
	
}
