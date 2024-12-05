package dsa_problems;

public class Sort_Colors {
	public void sortColors(int[] nums) {
	    int left = 0, right = nums.length - 1, mid = 0;

	    while (mid <= right) {
	        if (nums[mid] == 0) {
	            // Swap nums[left] and nums[mid]
	            int temp = nums[left];
	            nums[left] = nums[mid];
	            nums[mid] = temp;
	            // Increment both left and mid pointers
	            left++;
	            mid++;
	        } else if (nums[mid] == 1) {
	            // Move mid forward
	            mid++;
	        } else { // nums[mid] == 2
	            // Swap nums[mid] and nums[right]
	            int temp = nums[mid];
	            nums[mid] = nums[right];
	            nums[right] = temp;
	            // Decrement the right pointer
	            right--;
	        }
	    }
	}
}
