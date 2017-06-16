package easy;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class KeyboardRow {
	public String[] findWords(String[] words) {
		List<String> result=new ArrayList<String>();
		HashSet up=new HashSet(); 
		HashSet mid=new HashSet();
		HashSet bottom=new HashSet();
		
		up.add('a');
		up.add('s');
		up.add('d');
		up.add('f');
		up.add('g');
		up.add('h');
		up.add('j');
		up.add('k');
		up.add('l');
		
		up.add('A');
		up.add('S');
		up.add('D');
		up.add('F');
		up.add('G');
		up.add('H');
		up.add('J');
		up.add('K');
		up.add('L');
		
		mid.add('q');
		mid.add('w');
		mid.add('e');
		mid.add('r');
		mid.add('t');
		mid.add('y');
		mid.add('u');
		mid.add('i');
		mid.add('o');
		mid.add('p');
		
		mid.add('Q');
		mid.add('W');
		mid.add('E');
		mid.add('R');
		mid.add('T');
		mid.add('Y');
		mid.add('U');
		mid.add('I');
		mid.add('O');
		mid.add('P');
		
		bottom.add('z');
		bottom.add('x');
		bottom.add('c');
		bottom.add('v');
		bottom.add('b');
		bottom.add('n');
		bottom.add('m');
		
		bottom.add('Z');
		bottom.add('X');
		bottom.add('C');
		bottom.add('V');
		bottom.add('B');
		bottom.add('N');
		bottom.add('M');
		
		for(String word:words){
			char first=word.charAt(0);
			HashSet tmp=new HashSet();
			boolean can=true;
			if(up.contains(first)){
				tmp=up;
			}else if(mid.contains(first)){
				tmp=mid;
			}else
				tmp=bottom;			
			for(int i=1;i<word.length();i++){
				if(!tmp.contains(word.charAt(i))){
					can=false;
					break;
				}
			}
			if(can){
				result.add(word);
			}
		}
		String[] a=new String[result.size()];
		return result.toArray(a);
    }
	
	public static void main(String[] args){
		String[] words=new KeyboardRow().findWords(new String[0]);
		System.out.println(words.length);
		for(String word:words){
			System.out.println(word);
		}
	}
}
