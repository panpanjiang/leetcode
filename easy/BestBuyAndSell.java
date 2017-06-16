package easy;

public class BestBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BestBuyAndSell().maxProfit(new int[]{7, 6, 4, 3, 1}));
	}
	
	public int maxProfit(int[] prices) {
		int max=0;
		int sum=0;
		for(int i=0;i<prices.length-1;i++){
			sum+=prices[i+1]-prices[i];
			if(sum>max)
				max=sum;
			if(sum<0)
				sum=0;
		}
		return max;
    }

}
