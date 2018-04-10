public int[] search2D(int[][] matrix, int target) {
	int[] result = new int [] {-1, -1};
	if (matrix == null ||matrix.length == 0 || matrix[0].lenth == 0) {
		return  result;
	}
	int row = findRow (matrix, 0 ,matrix.length -1, target);
	if(row == -1) {
		return result;
	}
	int col = findCol(matrix[row], 0, matrix[row].length - 1, target);
	if(col == -1) {
		return result;
	}
	result[0] = row;
	result[1] = col;
	return result;
}
private int findRow(int[][] matrix, int up, int down, int target) {
	while(up <= down) {
		int mid = up - (up - down) /2;
		if(matrix[mid][0] > target) {
			down = mid -1;
		} else {
			up = mid +1 ;
		} 
	}
	return down;
}
private int findCol(int[] array, int left, int right, int target) {
	while (left <= right) {
		int mid = left - (left - right) /2;
		if(array[mid] == target) {
			return mid;
		} else if (array[mid] < target) {
			left = mid + 1;
		} else {
			right = mid -1;
		}
	}
	return -1;
}