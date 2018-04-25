package senla.hotel;

public class Guests {
	private Person[] people;
	private int n; //number of people already in this group
	private int dateIn;
	private int dateOut;
	
	public Guests(int capacity,int dateIn,int dateOut) {
		if (capacity<1) {
			capacity = 1;
		}
		n = 0;
		people = new Person[capacity];
		this.dateIn = dateIn;
		this.dateOut = dateOut;
	}
	
	public void AddPerson(String name,String surname,boolean gender) {
		if (n == people.length) {
			System.out.println("Too many people!");
		}else{
			Person temp = new Person(name,surname,gender);
			people[n] = temp;
			n++;
		}
	}
	
	public int GetSize() {
		return people.length;
	}
	
	public Person[] GetGuests() {
		return(people);
	}
	

}
