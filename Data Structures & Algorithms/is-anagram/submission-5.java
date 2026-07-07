class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // System.out.println(s.charAt(i));
            if (hms.containsKey(s.charAt(i))) {
                hms.put(s.charAt(i), hms.getOrDefault(s.charAt(i), 0) + 1);
            } else {
                hms.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            // System.out.println(s.charAt(i));
            if (hmt.containsKey(t.charAt(i))) {
                hmt.put(t.charAt(i), hmt.getOrDefault(t.charAt(i), 0) + 1);
            } else {
                hmt.put(t.charAt(i), 1);
            }
        }

        return hms.equals(hmt);
    }
}
