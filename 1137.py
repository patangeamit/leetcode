class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0: return 0
        if n == 1: return 1
        if n == 2: return 1
        one, two, three = 0,1,1
        for i in range(2,n):
            temp = one + two + three
            one = two
            two = three
            three = temp
        return three