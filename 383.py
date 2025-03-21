class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        hashmap = {}
        for c in magazine:
            if c in hashmap: hashmap[c] += 1
            else: hashmap[c] = 1
        for c in ransomNote:
            if c in hashmap and not hashmap[c] == 0:
                hashmap[c] -= 1
            else: return False
        return True
