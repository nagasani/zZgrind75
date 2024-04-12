package com.grind.imp;

class Solution11 {
	
    public static int maxArea1(int[] height) {

        /*
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < height.length; i++){
            map.put(i, height[i]);
        }
       */
       int area = 0;
        for(int i=0; i < height.length; i++)
        {
             for(int j=i+1; j < height.length; j++)
             {
                 area = Math.max(area,Math.max(height[i],height[j]) * (j-i));
             }
        }
        return area;
    }
    
    public static int maxArea(int[] height) 
    {
        int maxArea = 0;
        int left = 0;       // Pointer to the left-most line
        int right = height.length - 1; // Pointer to the right-most line

        while (left < right) {
            int currentWidth = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = currentWidth * currentHeight;

            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer of the shorter line inward to potentially increase the area
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;      
     }
    
    public static void main(String[] args) {
		maxArea(new int[] {1,8,6,2,5,4,8,3,7});
		//maxArea(new int[] {1,1});
	}
}