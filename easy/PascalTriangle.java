package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> result=new PascalTriangle().generate(2);
		System.out.println(result);		
	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		if(numRows==0)
			return result;
		for(int i=1;i<=numRows;i++){
			List<Integer> row=new ArrayList<Integer>();
			List<Integer> preRow=new ArrayList<Integer>();
			if(i>1)
				preRow=result.get(i-2);
			for(int j=0;j<i;j++){
				if(j==0||j==i-1){
					row.add(1);					
				}else{
					row.add(preRow.get(j-1)+preRow.get(j));
				}				
			}
			result.add(row);
		}
		return result;
		
    }

}
