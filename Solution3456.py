#3456. Find Special Substring of Length K
class Solution:
    def hasSpecialSubstring(self, s: str, k: int) -> bool:
        if s == '' and k == 0:
            return True
        counter = 0
        curr_char = s[0]
        for char in s:
            if curr_char == char:
                counter += 1
            else: 
                if counter == k:
                    return True
                counter = 1
                curr_char = char
        return counter == k
