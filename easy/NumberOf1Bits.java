package easy;

public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new NumberOf1Bits().hammingWeight(7));
	}

	public int hammingWeight(int n) {
		int num=0;
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		for(int i=0;i<32;i++){
			if((n&1)==1)
				num++;
			n=n>>1;
		}
		return num;
    }
}
