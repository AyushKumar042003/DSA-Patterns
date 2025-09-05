// 75 Sort Colors (Dutch National Flag Problem)
// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int i = 0;
        int high = nums.length - 1;

        while( i <= high){
            if( nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[low];
                nums[low] = temp;

                low++;
                i++;
            }else if( nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp; 

                high--;
            }else{
                i++;
            }
        } 
    }
}

// we can easly slove them using Arrays.sort(nums) but it contain tc = O(n log n) 
// Two Pointer Approach (Dutch National Flag) but using this it is tc =  O(n)