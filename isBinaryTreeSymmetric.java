class TreeNode{
	int key;
	TreeNode left;
	TreeNode right;
}

class solution{
	public boolean isSym(TreeNode root){
		if (root == null){
			return ture;
		}
		return isSym(root.left,root.right);
	}
	public boolean isSym(TreeNode root1, TreeNode root2){
		if(root1 == null &&root2 == null ) {
			return true;
		}
		if(root1 == null || root2 == null ) {
			return false;
		}
		//BaseCase
		if(root1.key != root2.key){
			return false;
		}
		return isSym(root1.right,root2.left)&&isSym(root1.left,root2.right);
	}

}

//Time Complexity O(N). Space Complexity O()


//IsTWisted:

public boolean isTwis(TreeNode root1, TreeNode root2){
	if(root1 == null && root2 == null) {
		return true;
	}
	if(root1 == null || root2 == null){

	}

	//BaseCase
	if (root1.key != root2.key){
		return false;
	} 
	return (isTwis(root1.left,root2.right)&&isTwis(root1.right,root2.left))||
			(isTwis(roo1.left,root2.left)&&isTwis(root1.right,root2.right))
	//Logica
}



public boolean isBST(TreeNode root){
	if (root == null){
		return true;
	}
	return isBST(root, Integer.Min_Value, Integer.Max_Value);
}

private boolean isBST(TreeNode root, int left, int right){
	if (root == null){
		return true;
	}//basecase
	if ((root.key > left) && (root < right)) {
		return (isBST(root.left,left,root.key)&&(isBST(root.right, root.key, right));
	}
	return false;
}
















