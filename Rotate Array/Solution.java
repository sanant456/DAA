mport java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k > n, we only need k % n rotations
        
        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }
    
    // Helper function to reverse part of an array
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {1,2,3,4,5,6,7};
        sol.rotate(nums1, 3);
        System.out.println(Arrays.toString(nums1)); // Output: [5,6,7,1,2,3,4]

        int[] nums2 = {-1,-100,3,99};
        sol.rotate(nums2, 2);
        System.out.println(Arrays.toString(nums2)); // Output: [3,99,-1,-100]
    }
}




