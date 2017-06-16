package easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String longestCommonPrefix(String[] strs) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<strs.length;i++){
			int len=strs[i].length();
			if(len<min)
				min=len;
		}
		StringBuffer result=new StringBuffer();
		for(int i=0;i<min;i++){
			char temp=strs[0].charAt(i);
			for(int j=0;j<strs.length;j++)
				if(strs[j].charAt(i)!=temp)
					return result.toString();
			result.append(temp);
		}
		return result.toString();
    }

}
