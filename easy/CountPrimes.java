package easy;

public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CountPrimes().countPrimes(72));
	}
	
	public int countPrimes(int n) {
		if(n<=1)
			return 0;
		int count=0;
		boolean[] original=new boolean[n+1];//0ËØÊý£¬1ºÏÊý
		for(int i=2;i<n+1;i++){
			if(!original[i]){
				count++;
				int k=2;
				while(i*k<=n){
					original[i*k]=true;
					k++;
				}
			}
		}
		return count;
    }

}
