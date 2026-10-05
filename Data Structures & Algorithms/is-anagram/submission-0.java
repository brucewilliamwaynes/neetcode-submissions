class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int len = s.length();
        int freq[] = new int[26];
        for(int idx = 0; idx < len; idx++) {
            freq[s.charAt(idx)-'a']++;
        }
        for(int idx = 0; idx < len; idx++) {
            freq[t.charAt(idx)-'a']--;
        }
        for(int idx = 0; idx < 26; idx++) {
            if(freq[idx] != 0) {
                return false;
            }
        }
        return true;
    }
}
