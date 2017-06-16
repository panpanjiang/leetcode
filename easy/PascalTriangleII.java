package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new PascalTriangleII().getRow(6));
		System.out.println(Integer.MAX_VALUE);
	}
	
	public List<Integer> getRow(int rowIndex) {
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<rowIndex+1;i++){
			result.add(1);
		}
		for(int i=0;i<1+rowIndex;i++){
			int temp=1;
			for(int j=0;j<i+1;j++){
				if(j==0||j==i){
					result.set(j, 1);
				}else{
					int curr=temp+result.get(j);
					temp=result.get(j);
					result.set(j,curr);
				}								
			}			
		}
		return result;
    }

}
