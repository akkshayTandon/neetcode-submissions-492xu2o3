class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}

        for s in strs:
            character_frequency_array = [0] * 26

            for c in s:
                index_position = ord(c) - ord('a')
                character_frequency_array[index_position] += 1
            
            # key = tuple(character_frequency_array)
            # key = ''.join(str(character_frequency_array))
            key = str(character_frequency_array)

            if key not in groups:
                groups[key] = []
            
            groups[key].append(s)
        
        return list(groups.values())
