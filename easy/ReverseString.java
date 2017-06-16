package easy;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ReverseString().reverseString("hello"));

	}
	
	public String reverseString(String s) {
//        char[] sArray=s.toCharArray();
//        int start=0;
//        int end=sArray.length-1;
//        while(start<end){
//        	sArray[start]=(char)(sArray[start]^sArray[end]);
//        	sArray[end]=(char)(sArray[start]^sArray[end]);
//        	sArray[start]=(char)(sArray[end]^sArray[start]);
//        	start++;
//        	end--;
//        }
//        return new String(sArray);
		return new StringBuffer(s).reverse().toString();
    }

}


    

