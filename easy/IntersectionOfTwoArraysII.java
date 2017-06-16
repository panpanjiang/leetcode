package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set=new IntersectionOfTwoArraysII().intersect(new int[]{1,2,2,1},new int[]{2,2});
		for(int i=0;i<set.length;i++){
			System.out.println(set[i]);
		}
	}
	
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer,Integer> nums1Map=new HashMap<Integer,Integer>();
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<nums1.length;i++){
			if(nums1Map.containsKey(nums1[i])){
				nums1Map.put(nums1[i], nums1Map.get(nums1[i])+1);
			}else
				nums1Map.put(nums1[i], 1);
		}
		for(int i=0;i<nums2.length;i++){
			if(nums1Map.containsKey(nums2[i])){
				result.add(nums2[i]);
				int count=nums1Map.get(nums2[i])-1;
				if(count==0)
					nums1Map.remove(nums2[i]);
				else
					nums1Map.put(nums2[i], count);
			}
		}
		int[] set=new int[result.size()];
		for(int i=0;i<result.size();i++){
			set[i]=result.get(i);
		}
		return set;
    }

}
