public class Test{
	public static void main(String[] args){
		Department dep = new Department("Software Development",2);
		dep.NewPosition("Programmers",2);
		dep.NewPosition("Testing",1);
		
		System.out.println(" " + dep.GetPositions().length);
		for(int i = 0;i<dep.GetPositions().length;i++){
			System.out.println(i+". "+dep.GetPositions()[i].GetName());
		}
		
		dep.GetPositions()[0].AddEmployee("Ivan","Neivanov",29,300);
		dep.GetPositions()[0].AddEmployee("Pmhbz","Hihjdgnsd",44,200);
		dep.GetPositions()[1].AddEmployee("Irina","Testova",30,200);


		Employee[] emps = dep.GetEmployeesList();

		int emp_num = emps.length; 

		emps[0].SetContacts(45726,"vanya@ivan.ru","orel address");
		emps[1].SetContacts(916416,"pajeet@coder.org","rashyufscf");
		emps[2].SetContacts(85698,"test@mail.ru","orel too");
			
		for(int i=0;i<emp_num;i++){
			System.out.println(emps[i].GetInformation());
			System.out.println("Контакты: \n"+emps[i].GetContacts()+"\n");
			
		}
		
		System.out.println("Просят "+dep.GetSalarySum()+" денег");
	}
}