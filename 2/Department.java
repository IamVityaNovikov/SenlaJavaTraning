public class Department{
	String name;
	Position[] positions;
	int id;
	int pos_n;
	static int dep_n = 0;
	
	public Department(String name,int n){
		this.name = name;
		positions = new Position[n];
		id = dep_n;
		pos_n=0;
		dep_n++;
	}

	public Employee[] GetEmployeesList(){
		int len = 0;
		for(int i=0;i<positions.length;i++){
			int l = positions[i].GetEmployeesList().length;
			len+=l;
		}
		Employee[] resList = new Employee[len];
		int ind = 0;
		for(int i = 0;i<positions.length;i++){
			Employee[] empList = positions[i].GetEmployeesList();
			for(int j = 0;j<empList.length;j++){
				resList[ind]=empList[j];
				ind++;
			}
		}
		return resList;
	}
	
	public void NewPosition(String name,int n){
		Position temp = new Position(name,n);
		positions[pos_n] = temp;
		pos_n++;
	}

	public Position[] GetPositions(){
		return (positions);
	}

	public int GetSalarySum(){
		Employee[] temp = GetEmployeesList();
		int sum = 0;
		for(int i =0;i<temp.length;i++){
			sum += temp[i].GetSalary();
		}
		return(sum);
	}
}