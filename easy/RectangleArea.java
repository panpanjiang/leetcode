package easy;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RectangleArea().computeArea(-2, -2, 2, 2, -1, 4,
				1, 6));
	}
	
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		if(E>=C||A>=G||F>=D||B>=H)
			return Math.abs(C-A)*Math.abs(D-B)+Math.abs(G-E)*Math.abs(H-F);		
		if(A<=E&&B<=F&&G<=C&&H<=D)
			return Math.abs(C-A)*Math.abs(D-B);
		if(E<=A&&F<=B&&C<=G&&D<=H)
			return Math.abs(G-E)*Math.abs(H-F);
		else {
			int maxHeight=Math.max(D, H);
			int minHeight=Math.min(B, F);
			int maxLeft=Math.min(E, A);
			int maxRight=Math.max(C, G);
			int len=(C-A)+(G-E)-(maxRight-maxLeft);
			int height=(D-B)+(H-F)-(maxHeight-minHeight);
			return (C-A)*(D-B)+(G-E)*(H-F)-len*height;
		}
    }

}
