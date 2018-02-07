boolean isBST(TreeNode root){
	if(root == null){
		return true;
	}
	return isBST(root.left, Integer.MIN_VALUE,root)&&isBST(root.right, root, Integer.MAX_VALUE)

}
private boolean isBST(TreeNode root, int min, int max){
	if(root == null){
		return true;
	}
	if(root.key> min)&& (root.key<max){
		return isBST(root.left,min,root.key)&&
				isBST(root.right,root.key,max);
	}
	return false;
}



Print BSTkeys in the given range
//ASSUME K1 < K2 --------
public void printCertainBST(TreeNode root,int k1, int k2){
	if(root == null){
		return;
	}



	if(root.key > k1){
		printCertainBST(root.left,k1,k2);
	}

	if(root.key >= k1 && root.key <= k2){
		System.out.println(root.key);
	}
	if(root.key < k2){
		printCertainBST(root.right, k1, k2);
	}
	return;

}



