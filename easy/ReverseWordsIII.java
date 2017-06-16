package easy;

public class ReverseWordsIII {
	public static String reverseWords(String s) {
		String[] words=s.split(" ");
		StringBuffer bf=new StringBuffer();
		for(int i=0;i<words.length;i++){
			bf.append(reverse(words[i]));
			if(i<words.length-1){
				bf.append(" ");
			}			
		}
		return bf.toString();
    }
	public static String reverse(String word){
		char[] charArray=word.toCharArray();
		int i=0;
		int j=charArray.length-1;
		while(i<j){
			char tmp=charArray[j];
			charArray[j]=charArray[i];
			charArray[i]=tmp;
			i++;
			j--;
		}
		return new String(charArray);
	}
	
	public static void main(String[] args){
		System.out.println(reverseWords("Let's take LeetCode contest")+"***");
	}

}
