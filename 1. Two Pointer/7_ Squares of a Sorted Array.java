// 977  Squares of a Sorted Array
//https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // store 
        int left = 0;
        int right = n - 1;
        int pos = n - 1; // fill from end 

        while( left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if( leftSquare > rightSquare){
                result[pos] = leftSquare;
                left++;
            }else{
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return result;
        
    }
}

