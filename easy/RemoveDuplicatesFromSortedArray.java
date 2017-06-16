package easy;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int removeDuplicates(int[] nums) {
		if(nums.length==0)
			return 0;
		int dup=nums[0];
		int res=0;
		for(int i=1;i<nums.length;i++){
			if(nums[i]==dup)
				res++;
			else{
				dup=nums[i];
				nums[i-res]=dup;
			}
		}
		return nums.length-res;
    }

}
