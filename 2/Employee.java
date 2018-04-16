public class Employee extends Person{

	int salary;
	boolean isReady;
	
	public Employee(String name,String surname,int age,int salary){
		super(name,surname,age);
		this.salary = salary;
		isReady = true;
	}

	public String GetImformation(){
		String res = super.GetInformation();
		return (res);
	}
	
	public void Fire(){
		isReady = false;
		contacts = null;
	}

	public int GetSalary(){
		return salary;
	}

}