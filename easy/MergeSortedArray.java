package easy;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1=new int[1];
		nums1[0]=0;		
		new MergeSortedArray().merge(nums1,0,new int[]{3}, 1);
		for(int i=0;i<3;i++){
			System.out.println(nums1[i]);
		}
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int point1=m-1;
		int point2=n-1;
		int i=m+n-1;
		while(point1>=0&&point2>=0){
			if(nums2[point2]>nums1[point1]){
				nums1[i]=nums2[point2];
				point2--;				
			}else{
				nums1[i]=nums1[point1];
				point1--;
			}
			i--;
		}
		if(point1<0){
			while(point2>=0){
				nums1[i]=nums2[point2];
				i--;
				point2--;
			}
		}
		
    }

}
