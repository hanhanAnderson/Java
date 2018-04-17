public List<Integer> inorder(TreeNode root) {
	List<Integer> inorder = new ArrayList<Integer>();
	Deque<Integer> stack = new LinkedList<TreeNode>();
	if(root == null) {
		return inorder;
	}
	TreeNode curr = root;
	if(curr != null || !stack.isEmpty()) {
		if(cur != null) {
			stack.offerFirst(curr);
			curr = curr.left;
		} else {
			curr = stack.pollFirst();
			inorder.add(curr.key);
			curr = curr.right;
		}
	}
	return inorder;
}