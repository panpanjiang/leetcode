package easy;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RansomNote().canConstruct("aa", "aab"));
	}
	
	public boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length()>magazine.length())
			return false;
		HashMap alpah=new HashMap();
		for(int i=0;i<magazine.length();i++){
			if(alpah.containsKey(magazine.charAt(i))){
				alpah.put(magazine.charAt(i), 1+(int)alpah.get(magazine.charAt(i)));
			}else{
				alpah.put(magazine.charAt(i), 1);
			}
		}
		for(int i=0;i<ransomNote.length();i++){
			if(alpah.containsKey(ransomNote.charAt(i))){
				int count=(int)alpah.get(ransomNote.charAt(i));
				if(count-1<0)
					return false;
				alpah.put(ransomNote.charAt(i), count-1);
			}else
				return false;
		}
		return true;
    }

}
