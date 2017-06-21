package easy;

import java.util.Arrays;

public class DistributeCandies {
	public static int distributeCandies(int[] candies) {
		if(candies==null||candies.length==0)
			return 0;
		Arrays.sort(candies);
		int count=1;
		int result=candies.length/2;
		for(int i=1;i<candies.length;i++){
			if(candies[i]!=candies[i-1])
				count++;
		}
		if(count<result){
			result=count;
		}
		return result;
    }
	
	public static void main(String[] args){
		int[] candies=new int[]{1,1,2,3};
		System.out.println(distributeCandies(candies));
	}
}
