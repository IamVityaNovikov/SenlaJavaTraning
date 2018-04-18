public class main{
	public static void main(String[] args){
		StringHelper helper = new StringHelper();
		int n = args.length;
		for(int i = 0;i<n;i++){
			args[i] = helper.FirstToUpper(args[i]);
		}
		String result = helper.ConcatStringArray(args);
		System.out.println(result);
		
	}
}