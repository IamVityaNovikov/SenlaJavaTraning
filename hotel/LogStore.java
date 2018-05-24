import java.util.ArrayList;
import java.util.List;

public class LogStore {
	
	private int idCountRoom;
	private int idCountService;
	private List<RoomLog> roomLogs;
	private List<ServiceLog> serviceLogs;
	
	public LogStore() {
		idCountRoom = 0;
		idCountService = 0;
		roomLogs = new ArrayList<RoomLog>();
		serviceLogs = new ArrayList<ServiceLog>();
	}
	
	void addServiceLog(int service,int price,int person,int date) {
		serviceLogs.add(new ServiceLog(idCountService,service,price,person,date));
		idCountService++;
	}
	
	void addRoomLog(int room,int order) {
		roomLogs.add(new RoomLog(idCountRoom,room,order));
		idCountRoom++;
	}
	
	void save() {
		// save logs to file
	}
	
	void load() {
		// load logs from file
	}
}
