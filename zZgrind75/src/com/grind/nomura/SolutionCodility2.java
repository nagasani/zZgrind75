package com.grind.nomura;

import java.util.Arrays;

class SolutionCodility2 
{
	public int solution(int[] A) 
	{
		// Sort the positions to facilitate the sliding window approach
		Arrays.sort(A);

		int N = A.length;
		int minMoves = Integer.MAX_VALUE;
		
		//Integer.toString(minMoves)

		// Use a sliding window to find the minimum number of moves
		for (int i = 0; i < N; i++) 
		{
			// The window starts at A[i]
			int j = i;
			// Expand the window to include as many basketballs as possible within the range
			while (j < N && A[j] - A[i] < N) 
			{
				j++;
			}
			// Calculate the number of basketballs in the current window
			int windowSize = j - i;
			// Calculate the moves needed to bring all basketballs into this window
			minMoves = Math.min(minMoves, N - windowSize);
		}
		return minMoves;
	}

	public static void main(String[] args) {
		SolutionCodility2 sol = new SolutionCodility2();
		int[] A = { 6, 4, 1, 7, 10 };
		System.out.println(sol.solution(A)); // Output should be 2
	}
}