package easy;

import java.util.Stack;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new AddBinary().addBinary("11", "0"));
	}
	
	public String addBinary(String a, String b) {
		if(a.equals(""))
			return b;
		if(b.equals(""))
			return a;
		String h1;//×î³¤µÄ×Ö·û´®
		String h2;
		if(a.length()>b.length()){
			h1=a;
			h2=b;
		}
		else{
			h1=b;
			h2=a;
		}
		int i=h1.length()-1;
		int j=h2.length()-1;
		int jinwei=0;
		Stack result=new Stack();
		while(j>=0){
			char temp1=h1.charAt(i);
			char temp2=h2.charAt(j);
			int tempInt1,tempInt2;
			tempInt1=(temp1=='1')?1:0;
			tempInt2=(temp2=='1')?1:0;
			int temp=(tempInt1+tempInt2+jinwei)%2;
			jinwei=(tempInt1+tempInt2+jinwei)>=2?1:0;
			if(temp==0){
				result.push('0');			
			}else{
				result.push('1');
			}	
			i--;
			j--;
		}
		while(i>=0){
			char temp1=h1.charAt(i);
			int tempInt1=(temp1=='1')?1:0;
			int temp=(tempInt1+jinwei)%2;
			jinwei=(tempInt1+jinwei)>=2?1:0;
			if(temp==0)
				result.push('0');
			else
				result.push('1');
			i--;						
		}
		if(jinwei==1)
			result.push('1');
		StringBuffer resultString=new StringBuffer();
		while(!result.empty()){
			resultString.append((char)result.pop());
		}
		return resultString.toString();
    }

}
