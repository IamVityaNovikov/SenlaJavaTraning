public class NumberHelper{
	public int[] NumberToArray(int source){
		int sep = 0;
		if (source == 0){
			int[] res = new int[1];
			res[0]=0;
			return (res);
		}
		int temp = source;
		while (temp>0){
			sep++;
			temp=temp/10;
		}
		int[] res = new int[sep];
		for(int i = sep-1;i>=0;i--){
			res[i]=source%10;
			source = source/10;
		}
		return(res);
	}	

	public int ArraySum(int[] arr){
		int res = 0;
		int n = arr.length;
		for(int i = 0;i<n;i++){
			res+=arr[i];
		}
		return(res);
	}
}