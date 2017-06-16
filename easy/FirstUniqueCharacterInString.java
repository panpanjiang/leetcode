package easy;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new FirstUniqueCharacterInString().firstUniqChar("loveleetcode"));
	}
	
	public int firstUniqChar(String s) {
		int[] count=new int[26];
		int result=Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++){
			char temp=s.charAt(i);
			int index=temp-'a';
			if(count[index]==0)
				count[index]=i+1;
			else
				count[index]=-1;
		}
		for(int i=0;i<26;i++){
			if(count[i]>0){
				if(result>count[i]){
					result=count[i];
				}
			}
		}
		if(result==Integer.MAX_VALUE)
			return -1;
		else
			return result-1;
    }

}
