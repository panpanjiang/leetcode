package easy;

public class MergeTwoBinaryTrees617 {
	public static void main(String[] arg){
		TreeNode tree1=new TreeNode(1);
		tree1.left=new TreeNode(3);
		tree1.right=new TreeNode(2);
		tree1.left.left=new TreeNode(5);
		
		TreeNode tree2=new TreeNode(2);
		tree2.left=new TreeNode(1);
		tree2.right=new TreeNode(3);
		tree2.left.right=new TreeNode(4);
		tree2.right.right=new TreeNode(7);
		
		TreeNode result=mergeTrees(tree1,tree2);
		System.out.println("Done!");
	}
	
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1==null&&t2==null){
			return null;
		}else if(t1==null){
        	return t2;
        }else if(t2==null){
        	return t1;
        }else{        	
        	TreeNode root=new TreeNode(t1.val+t2.val);
        	TreeNode left=mergeTrees(t1.left,t2.left);
        	TreeNode right=mergeTrees(t1.right,t2.right);
        	t1=null;
        	t2=null;
        	root.left=left;
        	root.right=right;
        	return root;
        }
    }

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
