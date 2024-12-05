package sprint6_Devi;

public class mergeArrays {
public static int[] merge(int m, int n, int arr[], int arr1[]) {
	int p1=m-1, p2=n-1, index=arr.length-1;
	while(p1>=0 && p2>=0) {
		if(arr[p1]<arr[p2]) {
			arr[index]=arr[p2];
			p2--;
			index--;
		}
		else if(arr[p1]>arr[p2]) {
			arr[index]=arr[p1];
			p1--;
			index--;
		}
		else 
			arr[index]=arr[p1];
		    p1--;
		    index--;
	}
	while(p1<0 && p2>=0) {
		arr[index]=arr[p2];
		p2--;
		index--;
	}
	while(p2<0 && p1>=0) {
		arr[index]=arr[p1];
		p1--;
		index--;
	}
	
	return arr1;
	
}

public static void main(String[] args) {
    int[] nums1={1,2,3,0,0,0};
    int[] nums2={2,5,6};
    int m=3,n=3;
     mergeArrays.merge(m, n, nums1, nums2);
}
}
