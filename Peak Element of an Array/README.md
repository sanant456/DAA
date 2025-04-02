# Peak Element of an Array:-

A peak element in an array is an element that is strictly greater than its immediate neighbors.

Formally, for an array arr[] of size n, an element arr[i] is a peak if:
	•	arr[i] > arr[i-1] (if i > 0)
	•	arr[i] > arr[i+1] (if i < n-1)

### Edge cases:
	
  •	If the array has only one element, it is a peak.
	•	The first or last element can be a peak if it is greater than its single neighbor.

For example, in the array [1, 3, 20, 4, 1, 0], the peak element is 20 at index 2.
