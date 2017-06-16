package easy;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String temp=s.next();
		System.out.println(temp);
	}
	
	public String Reverse(String s){
		String[] sArray=s.split(" ");
		StringBuffer result=new StringBuffer();
		for(int i=0;i<sArray.length;i++){
			result.append(sArray[i]);
		}
		return result.toString();
	}

}
