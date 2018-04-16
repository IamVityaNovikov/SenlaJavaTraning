public class Contacts{

	int phoneNumber = 0;
	String email = new String();
	String address = new String();
	
	public Contacts(int number, String email, String address){
		phoneNumber = number;
		this.email = new String(email);
		this.address = new String(address);
	}

	public String GetContacts(){
		String res = new String("phone number: "+phoneNumber+
					 "\nemail: " + email+
					 "\naddress:" + address);
		return(res);
		
	}
}