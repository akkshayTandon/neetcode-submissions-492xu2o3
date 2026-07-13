class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 1:
            return strs[0]
        
        prefix = strs[0]
        prefix_length = len(prefix)

        for s in strs:
            
            while prefix != s[0:prefix_length]:
                prefix_length -= 1

                prefix = prefix[0:prefix_length]
        
        return prefix