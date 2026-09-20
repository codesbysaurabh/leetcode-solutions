class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty() && height[i] > height[st.peek()]) {
                int bottom = st.pop();
                if (st.isEmpty()) break;
                int left = st.peek();
                int width = i - left - 1;
                int waterHeight = Math.min(height[left], height[i]) - height[bottom];
                ans += width * waterHeight;
            }
            st.push(i);
        }
        return ans;
    }
}