# All Subsequences of String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**, generate all possible subsequences of the string (including the empty subsequence) and return them in lexicographical order.

A subsequence is obtained by deleting zero or more characters from the string without changing the relative order of the remaining characters.

 **Examples:** 

```
Input : s = "abc"
Output: ["", "a", "ab", "abc", "ac", "b", "bc", "c"]
Explanation: There are a total of 8 non-empty subsequences for the given string. 
```

```
Input: s = "aa"
Output: ["", "a", "a", "aa"]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T10:37:33.750Z  

```java
class Solution {
    
    List<String> result = new ArrayList<>();
    
    public List<String> powerSet(String s) {
        generate(s, 0, "");

           // Sort subsequences lexicographically
           Collections.sort(result);

           return result;
    }
    void generate(String s, int index, String current) {

            // Base case
            if (index == s.length()) {
                result.add(current);
                return;
            }

            // Choice 1: Include current character
            generate(s, index + 1, current + s.charAt(index));

            // Choice 2: Exclude current character
            generate(s, index + 1, current);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-set4302/1)