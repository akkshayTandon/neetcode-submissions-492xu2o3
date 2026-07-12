class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        String prefix = strs[0];
        int prefixLength = strs[0].length();

        for (String s : strs) {
            while (!s.startsWith(prefix)) {
                prefixLength--;
                prefix = prefix.substring(0, prefixLength);
            }
        }

        return prefix;
    }
}