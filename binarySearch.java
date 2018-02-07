int binary_search(int[] arr, int target){
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
		
	}
	return -1;
}





**Google Doc Coding:
Font -> Courier New / Source code pro
Tools -> Preferenc; unselect "automatically capitalize words"
Indentation -> Use TAB, not 4 spaces.


binary_search(TreeNode null){
	
}


consider a 2d  version
int binary_search(int[] a, int target) {
	int left = 0;
	int right = a.length -1;
	int mid = left - (left + right)/2 ;
	while (left <= right) {
		mid = left - (left + right)/2 ;
		if (a[mid] == target) {	
			return mid;
		}else if(target < a[mid]){  
			right = mid - 1;
		}else if(target > a[mid]){
			left = mid +1;
		}
	return -1;
	}
}

r = mid / col;        5 / col
c = mid % col;       5 % col

1  2  3  4.          mid = j / 2;   row*col-1     5 

5  6  7   8

9 10 11 12


Principle: 
1) reduce the search area by a half
2) cannot accidently avoided targety
