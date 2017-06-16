package easy;

public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ImplementstrStr().strStr("a", "a"));
	}
	
	public int strStr(String haystack, String needle) {
		int hlen=haystack.length();
		int nlen=needle.length();
		int j=0;
		int i=0;
		int[] next=getNext(needle);
		while(i<hlen&&j<nlen){
			if(j==-1||haystack.charAt(i)==needle.charAt(j)){
				i++;
				j++;
			}else
				j=next[j];
		}
		return (j==nlen)?(i-j):-1;
		
    }
	
	public int[] getNext(String needle){
		int len=needle.length();
		int[] next=new int[len];
		next[0]=-1;
		int k=-1;
		int j=0;
		while(j<len-1){
			if(k==-1||needle.charAt(j)==needle.charAt(k)){
				k++;
				j++;
				next[j]=k;
			}else{
				k=next[k];
			}
		}
		return next;
	}

}
