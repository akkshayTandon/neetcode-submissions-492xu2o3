class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        String prefix = strs[0];
        int prefixLength = prefix.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];

            while (!s.startsWith(prefix)) {
                // prefix = prefix.substring(0, prefix.length() - 1);
                prefixLength--;

                if (prefixLength == 0) return "";

                prefix = prefix.substring(0, prefixLength);
            }
        }
        return prefix;
    }
}
