import java.util.ArrayList;
import java.util.List;

public class PersonStore {
	
	private int idCount;
	private List<Person> persons;
	
	public PersonStore() {
		idCount = 0;
		persons  = new ArrayList<Person>();
	}
	
	void add(String name,String surname,boolean gender) {
		persons.add(new Person(idCount,name,surname,gender));
		idCount++;
	}
	
	String toStrinf(int id) {
		Person temp = getById(id);
		if(temp!=null) {
			return temp.toString();
		}
		return new String("");
	}
	
	Person getById(int id) {
		int n = persons.size();
		for (int i = 0;i<n;i++) {
			if(persons.get(i).getId()==id) {
				return persons.get(i);
			}
		}
		return null;
	}
	
	void remove(int id) {
		int n = persons.size();
		for(int i = 0;i<n;i++) {
			if(persons.get(i).getId()==id) {
				persons.remove(i);
				break;
			}
		}
	}
	
	
	
}
