class Solution {
    public long solution(int a, int b) {
        
        long sum = 0;
        
        if (a == b) {
            
            return (long) a;
        } else {
            
            int big = Math.max(a,b);
            int min = Math.min(a,b);
            
            for (int i = min; i <= big; i++) {
                sum += i;
            }
            
            return sum;
        }
    }
}