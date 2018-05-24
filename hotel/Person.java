
public class Person {
	
	int id;
	String name;
	String surname;
	boolean gender; //true stands for male
	
	Person(int id,String name,String surname,boolean gender){
		this.id = id;
		this.name = new String(name);
		this.surname = new String(surname);
		this.gender = gender;
	}
	
	int getId() {
		return id;
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
