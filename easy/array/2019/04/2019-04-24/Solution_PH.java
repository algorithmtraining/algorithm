class Solution {  //Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
                  //Memory Usage: 31.7 MB, less than 100.00% of Java online submissions for Fibonacci Number.             
    public int fib(int N) {
        int result = 0;
        if(N == 0)
        {
            return 0;
        }
        if(N == 1)
        {
            return 1;
        }
         int [] F = new int[N+1];
        F[0] = 0;
        F[1] = 1;
        for(int i = 2;i<=N;i++)
        {
            F[i] = F[i-1]+F[i-2];
        }
        return F[N];
    }
}
