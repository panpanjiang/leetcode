package easy;

import java.util.ArrayList;
import java.util.HashSet;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ReverseVowelsOfString().reverseVowels("leetcode"));
	}
	
	public String reverseVowels(String s) {
		HashSet vowels=new HashSet();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('u');
		vowels.add('o');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('U');
		vowels.add('O');
		ArrayList<Integer> index=new ArrayList();
		ArrayList value=new ArrayList();
		for(int i=0;i<s.length();i++){
			if(vowels.contains(s.charAt(i))){
				index.add(i);
				value.add(s.charAt(i));
			}
		}
		int len=index.size();
		if(len==0)
			return s;
		char[] reverse=s.toCharArray();		
		for(int i=0;i<len;i++)
			reverse[index.get(i)]=(char)value.get(len-1-i);
		return new String(reverse);
    }

}
