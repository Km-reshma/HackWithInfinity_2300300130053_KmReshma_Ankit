class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // count frequency of each letter

        // Count frequency
        for (char c : s.toCharArray()) {       //convert the string into character 
            freq[c - 'a']++;                   //c will take the value of each character in string one by one.
        }

        
        for (int i = 0; i < s.length(); i++) {     // Find first unique character
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No unique character found inthe string
    }
}