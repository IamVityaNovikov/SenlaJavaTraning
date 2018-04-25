package senla.hotel;

import java.util.ArrayList;
import java.util.List;

public class Control {
	
	private List<Service> services;
	private List<Room> rooms;
	private Guests tempGuest;
	private int today;
	
	public Control(int today) {
		this.today = today;
		services = new ArrayList<Service>();
		rooms  = new ArrayList<Room>();
		tempGuest = null;
		
	}
	
	public void AddService(String name,int price) {
		services.add(new Service(name,price));
	}
	
	public void ShowService() {
		int n = services.size();
		System.out.println("\nList of services:");
		for(int i=0;i<n;i++) {
			System.out.println(i+" - "+services.get(i).GetName()+" "+services.get(i).GetPrice());
		}
	}
	
	public void AddRoom(int price, int capacity, int stars,String about) {
		rooms.add(new Room(price,capacity,stars,about));
	}
	
	public void ShowRooms() {
		int n = rooms.size();
		System.out.println("\nRooms:");
		for(int i=0;i<n;i++) {
			System.out.println(i+" - "+rooms.get(i));
		}
	}
	
	public void InitOccupancy(int capacity,int dateOut) {
		tempGuest = new Guests(capacity,today,dateOut);
	}
	
	public void AddGuest(String name,String surname,boolean gender) {
		tempGuest.AddPerson(name, surname, gender);
	}
	
	public void GroupToRoom(int roomIndex) {
		Room room = rooms.get(roomIndex);
		if (room.isAvailable()) {
			rooms.get(roomIndex).AddGuests(tempGuest);
			tempGuest = null;
		} else System.out.println("Невозможно заселить в комнату");
	}
    
	
}
