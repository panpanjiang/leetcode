package easy;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElementI {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<findNums.length;i++){
			for(int j=0;j<nums.length;j++){
				if(findNums[i]==nums[j]){
					int k=j+1;
					for(;k<nums.length;k++){
						if(findNums[i]<nums[k]){
							result.add(nums[k]);
							break;
						}
					}
					if(k>=nums.length){
						result.add(-1);
					}
					break;
				}
			}
		}
		int[] a=new int[result.size()];
		for(int i=0;i<result.size();i++){
			a[i]=result.get(i);
		}
        return a;
    }
	
	public static void main(String[] args){
		for(int i:new NextGreaterElementI().nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}))
			System.out.println(i);
	}
}
