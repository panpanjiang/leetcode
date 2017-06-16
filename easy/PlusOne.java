package easy;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result=new PlusOne().plusOne(new int[]{1,0,0});
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
	}
	
	public int[] plusOne(int[] digits) {
		int jinwei=1;		
        for(int i=digits.length-1;i>=0;i--){
        	int temp=digits[i]+jinwei;
        	digits[i]=(temp)%10;
        	if(temp>=10)
        		jinwei=1;
        	else
        		jinwei=0;
        	        	
        }
        if(digits[0]==0){
        	int[] result=new int[digits.length+1];
        	result[0]=1;
        	for(int i=0;i<digits.length;i++){
        		result[i+1]=digits[i];
        	}
        	return result;
        }else
        	return digits;
    }

}
