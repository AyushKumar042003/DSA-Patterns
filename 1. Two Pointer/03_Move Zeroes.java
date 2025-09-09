// 283 Move Zeroes 
// https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if( nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}

/**
Two pointer 
i,j = 0;
Start with both at 0.

Iterate j from 0 to n-1.

If nums[j] != 0:

Swap nums[i] and nums[j].

Increment i.

By the end, all non-zero values are shifted to the front, and zeros are pushed to the back.
 */