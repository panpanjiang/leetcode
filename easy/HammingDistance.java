package easy;

public class HammingDistance {
	public static int hammingDistance(int x, int y) {
		int r=x^y;
		int count=0;
		for(int i=0;i<32;i++){
			if((r&1)==1){
				count++;				
			}			
			r=r>>1;
		}
		return count;
    }
	public static void main(String[] args){
		System.out.println(hammingDistance(1,4));		
	}

}
