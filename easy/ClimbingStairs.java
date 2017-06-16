package easy;

import java.util.HashMap;

public class ClimbingStairs {
	HashMap set=new HashMap();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ClimbingStairs().climbStairs(4));
	}
	
	public int climbStairs(int n) {
		if(n==0)
			return 1;
		if(n==1)
			return 1;		
		if(n==2)
			return 2;	
		int n2,n1;
		if(set.containsKey(n-2))
			n2=(int)set.get(n-2);
		else{
			n2=climbStairs(n-2);
			set.put(n-2,n2);
		}
		if(set.containsKey(n-1))
			n1=(int)set.get(n-1);
		else{
			n1=climbStairs(n-1);
			set.put(n-1,n1);
		}
		return n1+n2;
    }

}
