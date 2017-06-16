package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RemoveElement().removeElement(new int[]{},0));		
	}
	
	public int removeElement(int[] nums, int val) {
		if(nums.length==0){
            return 0;
        }
		int i,j;
		for(i=0,j=nums.length-1;i<j;){
			while(nums[i]!=val&&i<j){
				i++;
			}
			while(nums[j]==val&&i<j){
				j--;
			}
			int temp=nums[j];
			nums[i]=nums[j];
			nums[j]=temp;
		}
		if(nums[i]==val){
			return i;
		}else{
			return i+1;
		}
    }

}
