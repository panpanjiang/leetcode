package easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ValidParentheses().isValid("()]"));
	}
	
	public boolean isValid(String s) {
		Stack remain=new Stack();		
		if(s.length()==0)
			return true;
		for(int i=0;i<s.length();i++){
			char temp=s.charAt(i);
			if(remain.size()==0&&(temp=='}'||temp==']'||temp==')'))
				return false;
			if(temp=='{'||temp=='('||temp=='['){
				remain.push(temp);
			}else if(temp=='}'&&(char)remain.peek()=='{'||temp==']'&&(char)remain.peek()=='['||(char)remain.peek()=='('&&temp==')')
				remain.pop();
			else
				return false;
		}
		if(remain.size()!=0)
			return false;
		else
			return true;
    }

}
