**Google Doc Coding:
Font -> Courier New / Source code pro
Tools -> Preferenc; unselect "automatically capitalize words"
Indentation -> Use TAB, not 4 spaces.


int binary(int[] arr, int target){
	int left = 0, right = arr.length-1;
	int mid = 0;
	while (left<=right){
		mid = left-(left-right)/2;
		if(arr[mid] == target){
			return mid;
		}
		if(target < arr[mid]){
			right = mid - 1;
		}
		if(target > arr[mid]){
			left = mid +1;
		}
		return -1;
	}
}



