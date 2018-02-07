int binary_search (int a[], int size, int target) {
	int idx_left = 0;
	int idx_right = size -1 ;
	while (idx_left < idx_right) {
		int idx_mid = idx_left + (idx_right - idx_left)/2;
		if (a[idx_mid] == target) {
			return idx_mid;
		} else if (a[idx_mid] > target){
			idx_mid += 1;
		} else {
			idx_mid -= 1;
		}
	}
	return -1;
}