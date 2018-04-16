public class Person{

	String name;
	String surname;
	int age;
	Contacts contacts;
	int i = 0;
	
	public Person(String name,String surname,int age){
		this.name = new String(name);
		this.surname = new String(surname);
		this.age = age;
	}

	public String GetInformation(){
		String res = new String("name: "+name+
					 "\nsurname: " + surname+
					 "\nage:" + age);
		return(res);
	}

	public void SetContacts(int number, String email, String address){
		contacts = new Contacts(number,email,address);
	}
	
	public String GetContacts(){
		String res = contacts.GetContacts();
		return (res);	
	}

}