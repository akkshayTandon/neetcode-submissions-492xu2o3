class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}

        for s in strs:
            character_frequency_array = [0] * 26

            for c in s:
                indexPosition = ord(c) - ord('a') # ord() gives character value
                character_frequency_array[indexPosition] += 1;
            
            key = tuple(character_frequency_array)
            
            # groups[key] = []
            if key not in groups:
                groups[key] = []

            groups[key].append(s)
        
        return list(groups.values())