class Solution {
    public boolean rotateString(String s, String goal) {
        int sLen = s.length();
        if (sLen != goal.length()) {
            return false;
        }
        for (int i = 0; i < sLen; i++) {
            var match = true;
            for (int j = 0; j < sLen; j++) {
                if (s.charAt((i + j) % sLen) != goal.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}