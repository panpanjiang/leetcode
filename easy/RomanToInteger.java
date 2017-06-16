package easy;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RomanToInteger().romanToInt("DCXXI"));
	}
	
	public int romanToInt(String s) {
		int len=s.length();
        char[] sArray=s.toCharArray();
        int result=0;
        for(int i=0;i<len;i++){
        	int pre=1;
        	int num=0;
        	switch(sArray[i]){
        	case 'I':
        		num=1;
        		if(i<len-1){
            		if(sArray[i+1]=='V'||sArray[i+1]=='X')
            			pre=-1;
        		}
        		break;
        	case 'X':
        		num=10;
        		if(i<len-1){
            		if(sArray[i+1]=='L'||sArray[i+1]=='C')
            			pre=-1;
        		}
        		break;
        	case 'C':
        		num=100;
        		if(i<len-1){
            		if(sArray[i+1]=='D'||sArray[i+1]=='M')
            			pre=-1;
        		}
        		break;
        	case 'V':
        		num=5;
        		break;
        	case 'L':
        		num=50;
        		break;
        	case 'D':
        		num=500;
        		break;
        	case 'M':
        		num=1000;
        		break;
        	}
        	result+=pre*num;
        }
        return result;
    }

}
