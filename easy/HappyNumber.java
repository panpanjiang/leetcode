package easy;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new HappyNumber().isHappy(29));
	}
	
	public boolean isHappy(int n) {
		HashSet<Integer> set=new HashSet<Integer>();
		int sum=0;
		if(n<=0)
			return false;
		while(true){
			if(n<10){
				sum=n*n;
			}else{
				while(n!=0){
					sum+=(n%10)*(n%10);
					n=n/10;
				}
			}
			if(sum==1)
				return true;
			if(set.contains(sum))
				return false;
			else
				set.add(sum);
			n=sum;
			sum=0;
		}
    }

}

