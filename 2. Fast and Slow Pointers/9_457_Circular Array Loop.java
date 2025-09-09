// 457. Circular Array Loop
// https://leetcode.com/problems/circular-array-loop/description/

class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++ ){
            int slow = i;
            int fast = i;
            boolean forward = nums[i] > 0 ; // direction of movement

            while(true){
                 // move slow pointer by 1 step
                slow = nextIndex( nums, slow, forward );
                 // move fast pointer by 1 step
                fast = nextIndex( nums, fast, forward );

                if( fast != -1){
                     // move fast pointer by another step
                    fast = nextIndex( nums, fast, forward );
                }
                // if one of them becomes invalid (no cycle possible) → stop
                if( slow == -1 || fast == -1) break;
                // if slow meets fast → cycle detected
                if( slow == fast ) return true;
            }
        }
        return false;
    }
     // helper to calculate the next index with direction + safety checks
    private int nextIndex(int[] nums , int i , boolean forward ){
        boolean direction = nums[i] > 0; // direction of this step

        if( direction != forward ) return -1; // if direction changes, stop

        int n = nums.length;

        int next = ((i + nums[i]) % n + n ) % n ; // wrap around safely

        if (next == i) return -1; // single-element loop not allowed
        
        return next;
    }
}
