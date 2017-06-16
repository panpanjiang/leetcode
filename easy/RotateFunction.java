package easy;

public class RotateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RotateFunction().maxRotateFunction(new int[]{4,3,2,6}));
	}
	
	public int maxRotateFunction(int[] A) {
		if(A.length==0)
			return 0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++){
			int sum=0;
			int j=0;
			while(i+j<A.length){
				sum+=(i+j)*A[j];
				j++;
			}
			int k=0;
			while(j<A.length){
				sum+=k*A[j];
				j++;
				k++;
			}
			if(sum>max)
				max=sum;
		}
		return max;
    }

}
