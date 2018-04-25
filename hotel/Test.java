package senla.hotel;

public class Test {
	
	public static void main(String[] args) {
		Person me = new Person("Viktor","Novikov",true);
		Control control = new Control(28);
		System.out.println(me);
		
		control.AddService("Sell drugs", 666);
		control.AddService("Clean vomit", 20);
		control.ShowService();
		
		control.AddRoom(20, 3, 3, "Mediocre room");
		control.AddRoom(100, 5, 5, "Very good room");
		control.AddRoom(5, 1, 0, "Just fuck your shit up");
		control.ShowRooms();
	}
	
}
