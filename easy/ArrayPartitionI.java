package easy;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPartitionI {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum=0;
		for(int i=0;i<=nums.length-2;i+=2){
			sum+=nums[i];
		}
		return sum;
    }
	
	public static void main(String[] args){
		System.out.println(new ArrayPartitionI().arrayPairSum(new int[]{1,4,3,2}));
	}

}
