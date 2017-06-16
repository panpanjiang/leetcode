package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new HouseRobber().rob(new int[]{2,1,1,1}));					
	}
	
	public int rob(int[] nums) {
		if(nums.length==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		if(nums.length==2)
			return Math.max(nums[0], nums[1]);
		int[] profit=new int[nums.length+1];
		profit[0]=0;
		profit[1]=nums[0];
		profit[2]=Math.max(nums[0],nums[1]);		
		for(int i=3;i<=nums.length;i++){
			profit[i]=Math.max(nums[i-1]+profit[i-2], profit[i-1]);
		}
		return profit[nums.length];
		
		
		
    }

}
