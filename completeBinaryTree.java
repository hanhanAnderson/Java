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
  public boolean isCompleted(TreeNode root) {
    // Write your solution here
    if (root == null) {
    	return true;
    }
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    boolean flag = false;
    queue.offer(root);
    while(!queue.isEmpty()) {
    	TreeNode curr = queue.poll();
    	if(curr.left == null){
    		flag = true;
    	} else if (flag) {
    		return false;
    	} else {
    		queue.offer(curr.left);
    	}
    	if(curr.right == null) {
    		flag = true;
    	} else if (flag) {
    		return false;
    	}else {
    		queue.offer(curr.right);
    	}
    }
    return true;
  }
}
