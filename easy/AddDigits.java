package easy;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new AddDigits().addDigits(38));
	}
	
	public int addDigits(int num) {
        int sum=0;        
        while(num/10!=0){
        	sum+=num%10;
        	num=num/10;        	
        }
        sum+=num;        
        int loop=sum%10;
        int type=sum/10;
        return (loop+type)>9?(loop+type-9):(loop+type);        
    }

}
