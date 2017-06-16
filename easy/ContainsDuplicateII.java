package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1,2,3,4,1,6}, 6));
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(k==0)
			return false;
		HashSet<Integer> set=new HashSet<Integer>();
		int min=0;		
		for(int i=0;i<nums.length;i++){
			if(i-min==k){
				if(nums[i]!=nums[min]){
					set.remove(nums[min]);
					min++;
				}else
					return true;
			}
			if(set.contains(nums[i])){				
					return true;				
			}else{
				set.add(nums[i]);
			}
		}
		return false;
		
//		HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
//		for(int i=0;i<nums.length;i++){
//			if(hashmap.containsKey(nums[i])){
//				if(i-hashmap.get(nums[i])<=k)
//					return true;
//				else
//					hashmap.put(nums[i], i);
//			}else
//				hashmap.put(nums[i], i);
//		}
//		return false;
    }
	
}
