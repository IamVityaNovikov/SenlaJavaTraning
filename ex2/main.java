

public class main{
	
	public static void main(String[] args){
		RandomHelper rh = new RandomHelper();
		NumberHelper nh = new NumberHelper();
		int number = rh.GetNCharInt(3);
		System.out.println("Number is "+number);
		int[] temp = nh.NumberToArray(number);
		/*int[] temp = new int[2];
		temp[0] = 1;
		temp[1] = 4;*/
		int sum = nh.ArraySum(temp);
		System.out.println("Sum is "+ sum);
	}
}