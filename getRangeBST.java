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
  public List<Integer> getRange(TreeNode root, int min, int max) {
    // Write your solution here
    Lsit<Integer> list = new ArrayList<Integer>();
    getRange(root,min,max,list);
    return list;
  }
  private void getRange(TreeNode root, int min, int max, List<Integer> list) {
  	if (root == null) {
  		return;
  	}
  	if(root.key > min){
  		getRange(root.left, min, max, list);
  	}
  	if(root.key >= min && root.key <= max) {
  		list.add(root.key);
  	}
  	if(root.key < max) {
  		getRange(root.right, min ,max ,list);
  	}
  }
}

