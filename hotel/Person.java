package senla.hotel;

public class Person {
	private String name;
	private String surname;
	private boolean gender; // True stands for males

	public Person(String name,String surname,boolean gender) {
		this.name = new String(name);
		this.surname = new String(surname);
		this.gender = gender;
	}
	
	public String GetName() {
		return(new String(name));
	}
	
	public String GetSurname() {
		return(new String(surname));
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(name);
		sb.append(' ');
		sb.append(surname);
		sb.append(' ');
		if (gender) {
			sb.append('m');
		} else {
			sb.append('f');
		}
		return(sb.toString());
	}
	
}
