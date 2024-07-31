class Solution {
    public int lengthOfLongestSubstring(String s) {
          int n = s.length();
        int maxLength = 0;
        
        for (int i = 0; i < n; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (seen.contains(s.charAt(j))) {
                    break; // We found a repeating character, so we can stop here
                }
                seen.add(s.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        
        return maxLength;
    }
}