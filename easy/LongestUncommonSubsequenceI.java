package easy;

public class LongestUncommonSubsequenceI {
	public static int findLUSlength(String a, String b) {
		int al=a.length();
		int bl=b.length();
		if(al==bl){
			if(a.equals(b))
				return -1;
			return al;
		}else if(al>bl)
			return al;
		else
			return bl;
    }
	public static void main(String[] args){
		System.out.println(findLUSlength("aba", "cdc"));
	}
}
