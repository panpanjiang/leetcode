package easy;

import java.util.HashMap;

public class IntegerReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new IntegerReplacement().integerReplacement(2147483647));
	}

	public int integerReplacement(int n) {
		int count=0;
		while(n!=1){
			if(n%2==0)
				n=n/2;
			else{
			    if(n==2147483647){
			        n=n/2+1;
			        count++;
			    }else if((n-1)/2==1||((n-1)/2)%2==0)
					n=n-1;
				else{
					n=n+1;
				}
			}
			count++;				
		}
		return count;
    }
	
}
