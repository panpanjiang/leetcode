package easy;

public class ReshapeTheMatrix {
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int height=nums.length;
		int width=nums[0].length;
		if(height*width==r*c){
			int[][] result=new int[r][c];
			int trackR=0;
			int trackC=0;
			for(int i=0;i<height;i++){
				for(int j=0;j<width;j++){
					result[trackR][trackC]=nums[i][j];
					if(trackC==c-1){
						trackR++;
						trackC=0;
					}else
						trackC++;
				}
			}
			return result;
		}else
			return nums;
    }
	
	public static void main(String[] args){
		int[][] nums=new int[][]{{1,2},{3,4}};
		int[][] example1=matrixReshape(nums,1,4);
		int[][] example2=matrixReshape(nums,2,4);
		System.out.println("Done!");
	}

}
