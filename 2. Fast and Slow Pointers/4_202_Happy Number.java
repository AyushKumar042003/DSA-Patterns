// 202. Happy Number
// https://leetcode.com/problems/happy-number/


import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }
    public int sumOfSquares( int num){
        int sum = 0;
        while( num > 0){
            int digit = num % 10;
            sum += digit * digit;
            num = num/10;
        }
        return sum;
    }
}