public class Solution {
  public int[] kClosest(int[] array, int target, int k) {
    // Write your solution here
    if(array == null || array.length == 0){
      return array;
    }
    if (k == 0){
     return new int[0]; 
    }
    int left = largestSmallerEqual(array, target);
    int right = left + 1;
    int[] result = new int[k];
    for(int i = 0; i < k ; i++){
      if(right >= array.length || left >= 0 && target - array[left] <= array[right] - target) {
        result[i] = array[left--];
      }else{
      result[i] = array[right++];
      } 
    }
    return result;
  }
  private int largestSmallerEqual(int[] array, int target){
    int left = 0;
    int right = array.length - 1;
    while(left < right - 1){
      int mid = left - (left - right) / 2;
      if(array[mid] >= target){//does not matter w/ wo =
        right = mid ;
      }else{
        left = mid;
      }
    }
    if(array[right]<= target){
      return right;
    }
    if(array[left]<= target){
      return left;
    }
    return -1;
  }
}

