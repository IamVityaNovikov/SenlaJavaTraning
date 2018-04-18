public class StringHelper{
	public String FirstToUpper(String source){
		if (source.length()==0){
			return(source);
		}
		char[] result = source.toCharArray();
		char first = result[0];
		first = Character.toUpperCase(first);
		result[0] = first;
		return(new String(result));
	}

	public String ConcatStringArray(String[] source){
		String result = new String("");
		int n = source.length;
		if (n==1){
			return(source[0]);
		}
		if (n==0){
			return(result);
		}
		result = result.concat(source[0]);
		for(int i = 1;i<n;i++){
			result=result.concat(" ").concat(source[i]);
		}
		return(result);
	}
}