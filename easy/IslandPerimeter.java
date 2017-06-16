package easy;

public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int rowNum=grid.length;//����
		if(rowNum==0){
			return 0;
		}
		if(grid[0]==null){
			return 0;
		}
		int columnNum=grid[0].length;//����
		int count=0;//1�ĸ���
		int jiange=0;//�����
		for(int i=0;i<columnNum;i++){
			int lian=0;//������1�ĸ���
			for(int j=0;j<rowNum;j++){
				if(grid[j][i]==1){
					count++;
					lian++;
				}else {
					if(lian>0){
						jiange+=(lian-1);
						lian=0;
					}
				}
				
			}
			if(lian>0){
				jiange+=(lian-1);
				lian=0;
			}
		}
		
		for(int i=0;i<rowNum;i++){
			int lian=0;
			for(int j=0;j<columnNum;j++){
				if(grid[i][j]==1){
					lian++;
				}else{
					if(lian>0){
						jiange+=(lian-1);
						lian=0;
					}
				}
			}
			if(lian>0){
				jiange+=(lian-1);
				lian=0;
			}
		}
		return 4*count-2*jiange;
    }
	
	public static void main(String[] args){
		int[][] grid=new int[0][];
		System.out.println(new IslandPerimeter().islandPerimeter(grid));
	}

}
