package easy;

public class NumberComplement {
	public static int findComplement(int num) {
		//String bit=Integer.toBinaryString(num);
		//int len=bit.length();
		if(num==0){
			return 1;
		}
		int len=0;
		int shang=num;
		while(shang/2!=0||shang%2!=0){
			len++;
			shang=shang/2;
		}
		
		
		int tmp=1;
		int sum=0;
		for(int i=0;i<len;i++){
			int result=tmp&num;
			if(result==0){
				sum+=tmp;
			}
			tmp=tmp<<1;
		}
		return sum;
    }
	public static void main(String[] args){
		
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		
	}
	

}
