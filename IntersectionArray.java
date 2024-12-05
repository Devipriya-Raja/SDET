package sprint6_Devi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*public class IntersectionArray {
public int[] intersection(int[] arr1, int[] arr2) {
	int p1=0, p2=0;
	int size=arr1.length-arr2.length;
	List<Integer> arrlist = new ArrayList<Integer>();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	while(p1<arr1.length && p2<arr2.length) {
		if(p1<p2) {
			p1++;
		}
		else if(p2<p1) {
			p2++;
		}
		else
			arrlist.add(arr1[p1]);
			p1++;
		    p2++;
	}
	return arrlist;
}
}*/

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

