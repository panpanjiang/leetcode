package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,4,5,4,7}));
	}
	
	public boolean containsDuplicate(int[] nums) {
//		ArrayList judge=new ArrayList();
//		int len=nums.length;
//		for(int i=0;i<len;i++){
//			if(judge.contains(nums[i]))
//				return true;
//			else
//				judge.add(nums[i]);
//		}
//		return false;
		
		HashSet judge=new HashSet();
		int len=nums.length;
		for(int i=0;i<len;i++){
			if(judge.contains(nums[i]))
					return true;
			else
				judge.add(nums[i]);
		}
		return false;
    }

}
