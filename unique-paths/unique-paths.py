class Solution:
    
    def totalPaths(self, n, r):
        x , y = 1, 1
        for i in range(r,0,-1):
            x = x*n
            y = y*i
            n = n-1
        return x//y
    
    def uniquePaths(self, m: int, n: int) -> int:
        ans = self.totalPaths(m+n-2, n-1);
        return ans;
        