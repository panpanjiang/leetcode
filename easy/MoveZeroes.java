package easy;

import java.util.ArrayList;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,1,0,3,12,0,24,3,9,0,13,0};
		new MoveZeroes().moveZeroes(nums);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
	
	public void moveZeroes(int[] nums) {
		ArrayList indexes=new ArrayList();
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==0){
        		indexes.add(i);
        	}
        }
        indexes.add(nums.length);
        int zeronum=indexes.size()-1;
        int moveStart=(int)indexes.remove(0);
        int moveEnd;
        int step=1;
        while(indexes.size()>0){        	
        	moveEnd=(int)indexes.remove(0);
        	for(int i=moveStart+1;i<moveEnd;i++){
        		nums[i-step]=nums[i];
        	}
        	moveStart=moveEnd;
        	step++;
        }
//        for(int i=moveStart+1;i<nums.length;i++){
//        	nums[i-step]=nums[i];
//        }
        
        for(int i=nums.length-zeronum;i<nums.length;i++){
        	nums[i]=0;
        }
    }

}
