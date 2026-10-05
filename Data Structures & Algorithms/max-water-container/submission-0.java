class Solution {
    public int maxArea(int[] heights) {
        if(heights == null || heights.length == 0) {
            return 0;
        }
        int len = heights.length;
        int start = 0;
        int end = len - 1;
        int candArea = 0;
        int finalArea = 0;
        while(start < end) {
            candArea = (end - start) * Math.min(heights[start], heights[end]);
            finalArea = Math.max(finalArea, candArea);
            if(heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }
        return finalArea;
    }
}
