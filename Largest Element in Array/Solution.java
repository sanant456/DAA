import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min-Heap
        
        for (int num : nums) {
            minHeap.add(num); // Insert element
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest element if size > k
            }
        }
        
        return minHeap.peek(); // The root is the k-th largest element
    }
}
