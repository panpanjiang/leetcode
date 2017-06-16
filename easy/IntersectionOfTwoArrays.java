package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result=new IntersectionOfTwoArrays().intersection(new int[]{1,2,2,3,3,1},new int[]{2,3,2});
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}

	}
	
	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> set=new ArrayList<Integer>();
		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
		for(int i=0;i<nums1.length;i++){
			if(!map1.containsKey(nums1[i]))
				map1.put(nums1[i], nums1[i]);
		}
		for(int i=0;i<nums2.length;i++){
			if(!map2.containsKey(nums2[i]))
				map2.put(nums2[i], nums2[i]);
		}
		if(map1.size()>map2.size()){
			Iterator iter=map2.entrySet().iterator();
			while(iter.hasNext()){
				Entry entry=(Entry)iter.next();
				if(map1.containsKey(entry.getKey())){
					set.add((int)entry.getKey());
				}
			}
		}
		int[] result=new int[set.size()];
		for(int i=0;i<set.size();i++){
			result[i]=set.get(i);
		}
		return result;
		
    }

}
