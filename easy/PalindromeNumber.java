package easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PalindromeNumber().isPalindrome(2147483647));
	}
	
	public boolean isPalindrome(int x) {
		int count=0;
		int number=x;
		if(number<0)
			return false;
		if(number<10&&number>=0){
			return true;
		}
		while(number!=0){
			number=number/10;
			count++;
		}
		number=x;
		long result=0;
		for(int i=0;i<count/2;i++){
			result+=number%10*Math.pow(10, i)+(number%10)*Math.pow(10,count-1-i);
			number=number/10;			
		}
		if(count%2==0){
			return x-result==0?true:false;
		}else{
			return result+number%10*Math.pow(10, count/2)-x==0?true:false;
		}
    }

}
