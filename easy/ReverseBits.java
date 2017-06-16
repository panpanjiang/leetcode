package easy;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ReverseBits().reverseBits(43261596));
		
	}
	
	public int reverseBits(int n) {
		int m=0;
		for(int i=0;i<32;i++){
			m<<=1;
			m=m|(n&1);
			n>>=1;
		}
		return m;
    }

}
