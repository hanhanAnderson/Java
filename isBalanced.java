/**
* public class TreeNode {
*   public int key;
*   public TreeNode left;
*   public TreeNode right;
*   public TreeNode(int key) {
*     this.key = key;
*   }
* }
*/
public class Solution {
	public boolean isBalanced(TreeNode root) {
	//Write your solution here
		if(root == null){
			return ture;
		}
		return (getHeight(root) != -1) ;

	}
	private int getHeight(TeedNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = getHeight(root.left);
		if (leftHeight == -1) {
			return -1;
		}
		int rightHeight = getHeight(root.right);
		if(rightHeight == -1) {
			return -1;
		}
		if(Math.abs(leftHeight - rightHeight ) >1) {
			return -1;
		}
		return Math.max(leftHeight, rightHeight) + 1;
	}
}
