class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 1:
            return strs[0]
        
        prefix = strs[0]
        prefix_length = len(prefix)

        for i in range(1, len(strs)):
            s = strs[i]

            while prefix != s[0:prefix_length]:
                prefix_length -= 1

                if prefix_length == 0:
                    return ""
                
                prefix = prefix[0:prefix_length]
        
        return prefix