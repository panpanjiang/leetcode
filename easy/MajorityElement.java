package easy;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MajorityElement().majorityElement(new int[]{1}));
	}
	
	public int majorityElement(int[] nums) {
		HashMap<Integer,Integer> count=new HashMap<Integer,Integer>();
		int len=nums.length;
		for(int i=0;i<len;i++){
			if(count.containsKey(nums[i])){
				count.put(nums[i], 1+count.get(nums[i]));
			}else{
				count.put(nums[i], 1);
			}
			if(count.get(nums[i])>len/2)
			    return nums[i];
		}
		return -1;
		
//每找出两个不同的element，则成对删除。最终剩下的一定就是所求的。
//		int candidate = 0;
//        int count = 0;
//        for(int i = 0; i < nums.size(); i ++)
//        {
//            if(count == 0)
//            {
//                candidate = nums[i];
//                count = 1;
//            }
//            else
//            {
//                if(nums[i] == candidate)
//                    count ++;
//                else
//                    count --;
//            }
//        }
//        return candidate;
		
    }

}
