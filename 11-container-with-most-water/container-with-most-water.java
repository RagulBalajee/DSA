class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int max_area = 0;

        while (left < right) {
            int h = (height[left] < height[right]) ? height[left] : height[right];
            int width = right - left;
            int area = h * width;

            if (area > max_area) {
                max_area = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max_area;
    }
}

