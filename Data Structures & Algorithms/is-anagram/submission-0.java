class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> hm_s = new HashMap<>();
        HashMap<Character, Integer> hm_t = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            hm_s.put(s.charAt(i), hm_s.getOrDefault(s.charAt(i), 0) + 1);
            hm_t.put(t.charAt(i), hm_t.getOrDefault(t.charAt(i), 0) + 1);
        }

        return hm_s.equals(hm_t);
    }
}
