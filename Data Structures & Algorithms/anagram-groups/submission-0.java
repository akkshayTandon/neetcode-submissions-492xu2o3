class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> groups = new HashMap<>();

        for(String s: strs){
            // characters 'a' to 'z' represented by their index position in the array
            // then using this array as a key.
            int[] countFrequencyArray = new int[26]; 

            for(char c: s.toCharArray()){
                int indexPosition = c - 'a';
                // System.out.println(indexPosition);
                countFrequencyArray[indexPosition]++;
            }

            String key = Arrays.toString(countFrequencyArray);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
