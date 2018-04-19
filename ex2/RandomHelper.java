import java.util.Random;

public class RandomHelper{
	public int GetNCharInt(int n){
		if (n<=0){
			return(0);
		}
		Random rand = new Random();
		int result = rand.nextInt(9)+1;
		for(int i =1;i<n;i++){
			result*=10;
			result+=rand.nextInt(10);
		}
	return (result);
	}
}