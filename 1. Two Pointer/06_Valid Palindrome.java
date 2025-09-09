// 125 Valid Palindrome
//https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int n = s.length();
        for( int i = 0; i< n/2; i++){
            if(s.charAt(i) != s.charAt( n - 1 - i )){
                return false;
            }
        }
        return true;
    }
}


/**
Regex (Regular Expression)

A regex (short for regular expression) is a pattern language used to search, match, or replace text.

Think of it like a mini language inside your code that lets you describe text patterns.

#######################s = s.replaceAll("[^a-z0-9]","");#########################
eplaceAll(regex, replacement)
→ Finds all parts of the string that match the regex and replaces them.

Here the regex is:

[ ] → defines a character class (a set of allowed characters).

a-z → lowercase letters a through z.

0-9 → digits 0 through 9.

^ (at the beginning inside []) → negates, meaning NOT these characters.

So [^a-z0-9] means:
“any character that is not a lowercase letter or digit.”

The replaceAll replaces all of those unwanted characters with "" (empty string), effectively removing them.
 */
