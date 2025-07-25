using System;

public class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Array.Sort(A);
        Array.Sort(B, (a,b) => b - a);
        
        for(int i = 0; i < A.Length; i++)
        {
            answer += A[i] * B[i];
        }
        
        return answer;
    }
}