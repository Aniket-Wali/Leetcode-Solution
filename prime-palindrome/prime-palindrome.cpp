class Solution {
public:
    int primePalindrome(int N) {
         while (true) {
            if (N == isPalindrome(N) && isPrime(N))
                return N;
            N++;
            if (10000000 < N && N < 100000000)
                N = 100000000;
        }
    }
    
    bool isPrime(long N) {
        if (N < 2) return false;
        long R =  sqrt(N);
        for (long d = 2; d <= R; ++d)
            if (N % d == 0) return false;
        return true;
    }
    
    int isPalindrome(long N){
        long ans = 0;
        while (N > 0) {
            ans = 10 * ans + (N % 10);
            N /= 10;
        }
        return ans;
    }
    
};