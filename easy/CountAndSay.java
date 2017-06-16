package easy;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CountAndSay().countAndSay(4));
	}

	public String countAndSay(int n) {
		if(n<1)
			return "";
		String temp="1";
		if(n==1)
			return temp;		 
		for(int i=2;i<=n;i++){
			temp=say(temp);
		}
		return temp;
    }
	
	public String say(String s){
		int count=1;
		char temp=s.charAt(0);
		StringBuffer result=new StringBuffer();		
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==temp){
				count++;
			}else{
				result.append(count+""+temp);
				temp=s.charAt(i);
				count=1;
			}
		}
		result.append(count+""+temp);
		return result.toString();
	}
	
}
