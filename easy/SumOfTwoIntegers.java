package easy;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(new SumOfTwoIntegers().getSum(12, 24));
		System.out.println(Integer.MAX_VALUE);
	}
	
	public int getSum(int a, int b) {
		int AandB=a&b;
		int AxorB=a^b;
		int temp;
		while(AandB!=0){
			AandB=AandB<<1;
			temp=AxorB;
			AxorB=temp^AandB;
			AandB=temp&AandB;			
		}
		return AxorB;
	        
	}
	

}
