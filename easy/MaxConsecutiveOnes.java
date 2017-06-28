package easy;

public class MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int result=0;
		int count=0;
		for(int i=0;i<nums.length;i++){
			int xor=nums[i]&1;
			if(xor==1){
				count++;
			}else{
				if(count>result){
					result=count;
				}
				count=0;
			}
		}
		if(count>result){
			result=count;
		}
		return result;
    }
	public static void main(String[] args){
		int[] nums=new int[]{1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

}
