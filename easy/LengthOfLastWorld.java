package easy;

public class LengthOfLastWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LengthOfLastWorld().lengthOfLastWord(" "));
	}
	
	public int lengthOfLastWord(String s) {
		String temp=s.trim();
        if(temp.equals(""))
            return 0;
        String[] result=s.split(" ");
        return result[result.length-1].length();
        
    }

}
