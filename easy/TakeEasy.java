package easy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class TakeEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		dt.setDate(16);
		dt.setMonth(7);
		dt.setHours(21);
		dt.setMinutes(15);
		dt.setSeconds(0);
		dt.setYear(2016);
		Long time=dt.getTime();
		Random rand=new Random(time);
		int n;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<6;i++){
			n=Math.abs(rand.nextInt()%34);
			while(list.contains(n)){
				n=Math.abs(rand.nextInt()%34);
			}
			list.add(n);
		}
		int blue=Math.abs(rand.nextInt()%17);
		System.out.println("ºìÇò£º");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("À¶Çò£º");
		System.out.println(blue);

	}

}
