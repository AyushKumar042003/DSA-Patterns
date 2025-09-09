// 26 Remove Duplicates from Sorted Array LeetCode 26
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        for(int j = 1; j < nums.length; j++){
            if( nums[j] != nums[i - 1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
