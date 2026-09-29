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