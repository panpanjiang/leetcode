package easy;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PowerOfThree().isPowerOfThree(244));
	}
	
	public boolean isPowerOfThree(int n) {
		if(n==0)
			return false;
		int a=(int)(Math.log(n)/Math.log(3));
		return (n-Math.pow(3, a)==0)||(n-Math.pow(3, a+1)==0);
		
	}

}
