/*
*  interface Dictionary {
*    public Integer get(int index);
*  }
*/

// You do not need to implement the Dictionary interface.
// You can use it directly, the implementation is provided when testing your solution.
public class Solution {
public int search(Dictionary dictionary, int target){
    if(dictionary == null){
        return - 1;
    }
    int left = 0;
    int right = 1;
    while (dictionary.get(right)!= null && dictionary.get(right)<target){
        left = right;
        right = right * 2;
    }
    return binarySearch(dictionary, target, left, right);
}
private int binarySearch(Dictionary dict, int target, int left, int right){
    while(left <= right){
        int mid = left - (left - right) / 2;
        if(dict.get(mid) == null|| dict.get(mid) > target){
            right = mid - 1;
        }else if(dict.get(mid) < target){
            left = mid + 1;
        }else{
            return mid;
        }
    }
    return - 1;
}
}

