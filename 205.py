class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        intFormatS = 
        i = 0
        charDict = {}
        for c in s:
            if c not in charDict:
                i = i + 1
                charDict[c] = i
            else:
                i = charDict[c]
            intFormatS = intFormatS + str(i)
        intFormatT = 
        i = 0
        charDict = {}
        for c in t:
            if c not in charDict:
                i = i + 1
                charDict[c] = i
            else:
                i = charDict[c]
            intFormatT = intFormatT + str(i)
        return intFormatS == intFormatT
        
