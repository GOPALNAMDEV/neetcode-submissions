class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (!window.contains(ch)) {
                window.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                window.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}