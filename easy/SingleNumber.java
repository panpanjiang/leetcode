package easy;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SingleNumber().singleNumber(new int[]{1,2,3,3,2,1,4,5,5,6,7,6,7}));
	}
	
	public int singleNumber(int[] nums) {
		int result=nums[0];
		for(int i=1;i<nums.length;i++){
			result^=nums[i];
		}
		return result;
    }

}
