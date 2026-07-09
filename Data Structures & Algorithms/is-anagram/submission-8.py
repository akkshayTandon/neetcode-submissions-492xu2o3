class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        hms = {}
        hmt = {}

        for char in s:
            # print(i, char)
            if char in hms:
                hms[char] += 1
            else:
                hms[char] = 1

        for char in t:
            if char in hmt:
                hmt[char] += 1
            else:
                hmt[char] = 1

        return hms == hmt