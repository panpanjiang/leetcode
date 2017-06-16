package easy;

public class FindTheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new FindTheDifference().findTheDifference("abcd", "bcdae"));
	}

	public char findTheDifference(String s, String t) {
		int result=0;
		for(int i=0;i<s.length();i++){
			result^=s.charAt(i)^t.charAt(i);
		}
		result^=t.charAt(s.length());
		return (char)result;
    }
	
}
