public class Solution {
  public int[] search(int[][] matrix, int target) {
    // Write your solution here
	int[] result = new int[] {-1, -1};
	if(matrix.length ==0 || matrix[0].length ==0) {
		return result;
	}
	int rows = matrix.length;
	int cols = matrix[0].length;
	int left = 0;
	int right = cols * rows - 1;
	while(left <= right) {
		int mid = left - (left - right) /2;
		int row = mid / cols;
		int col = mid % cols;
		if(matrix[row][col] == target){
			result[0]= row;
      	result[1] = col;
			return result;
		} else if(matrix [row][col] < target) {
			left = mid + 1;
		} else {
			right = mid -1;
		}
	}
	return result;
}
}

