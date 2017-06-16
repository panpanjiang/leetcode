package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result=new TwoSum().twoSum(new int[]{-3,4,3,90},0);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
	}
	
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> set=new HashMap<Integer,Integer>();
		int[] result=new int[2];
		int s1=0,s2=0;
		for(int i=0;i<nums.length;i++){
			
				if(set.containsKey(nums[i]))
					set.put(nums[i], set.get(nums[i])+1);
				else
					set.put(nums[i], 1);
			
		}
		for(int i=0;i<nums.length;i++){
			
				if(set.containsKey(target-nums[i])){
					if(target-nums[i]==nums[i]){
						if(set.get(nums[i])>1){
							s1=nums[i];
							s2=nums[i];	
							break;
						}					
					}else{
						s1=nums[i];
						s2=target-nums[i];
						break;
					}
				}
			
		}
		boolean flag=false;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==s1&&!flag){
				result[0]=i;
				flag=true;
				continue;
			}else if(nums[i]==s2&&flag){
				result[1]=i;
				break;
			}
		}
		return result;
		
    }

}
