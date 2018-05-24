
public class Hotel {
	ServiceStore services;
	RoomStore rooms;
	OrderStore orders;
	PersonStore persons;
	LogStore logs;
	int date;
	
	Hotel(int date){
		services = new ServiceStore();
		rooms = new RoomStore();
		orders = new OrderStore();
		persons = new PersonStore();
		logs = new LogStore();
		this.date = date;
	}
	
	void showRooms() {
		// to add sorting later
		int n = rooms.getSize();
		for(int i = 0;i<n;i++) {
			System.out.println(rooms.toString(n));
		}
	}
	
	void addRoom(int price,int stars,int capacity,String about) {
		rooms.add(price, stars, capacity, about);
	}
}
