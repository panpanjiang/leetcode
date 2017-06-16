package easy;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ExcelSheetColumnNumber().titleToNumber("AB"));
	}
	
	public int titleToNumber(String s) {
        int len=s.length();
        int result=0;
        for(int i=0;i<len;i++){
        	result+=(s.charAt(len-1-i)-'A'+1)*Math.pow(26, i);
        }
        return result;
    }

}
