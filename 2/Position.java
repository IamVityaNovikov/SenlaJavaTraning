public class Position{
	String name;
	Employee[] employees;
	
	private int emp_n;

	public Position(String name,int n){
		this.name = new String(name);
		employees = new Employee[n];
		emp_n = 0;
	}
	
	public String GetName(){
		return (new String(name));
	} 
	
	public Employee[] GetEmployeesList(){
		Employee[] result = employees;
		return (result);
	}

	public void AddEmployee(String name,String surname,int age,int salary){
		if (emp_n < employees.length){
			employees[emp_n] = new Employee(name,surname,age,salary);
			emp_n++;
		} else{
			System.out.println("Too namy employees");
		}
	}
}