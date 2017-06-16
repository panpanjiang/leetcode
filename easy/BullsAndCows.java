package easy;

import java.util.ArrayList;
import java.util.HashSet;

public class BullsAndCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BullsAndCows().getHint("1807", "7810"));		
	}
	
	public String getHint(String secret, String guess) {
		int[] count=new int[10];
		int bulls=0;
		for(int i=0;i<secret.length();i++){
			char gtemp=guess.charAt(i);
			char stemp=secret.charAt(i);
			if(gtemp==stemp)
				bulls++;
			count[stemp-'0']++;
			count[gtemp-'0']--;			
		}
		int side=0;
		for(int i=0;i<10;i++){
			if(count[i]>0){
				side+=count[i];
			}
		}
		return bulls+"A"+(secret.length()-side-bulls)+"B";
    }

}
