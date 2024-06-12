package com.grind.nomura;
import java.util.Arrays;


class SolutionCodility 
{
    public static int solution(int[] A) {
        Arrays.sort(A);
        int size = A.length;
        int minimumMoves = Integer.MAX_VALUE;
        for(int i = 0; i <= size-1; i++)
        {
            int l = A[i];           
            int r = A[i+size-1];
            int movesCurrent = r - l - (size-1);
            minimumMoves = Math.min(minimumMoves, movesCurrent);
        }
        return minimumMoves;
    }
    
    public static void main(String[] args) 
    {
    	System.out.println(solution(new int[]{6,4,1,7,10}));
	}
}