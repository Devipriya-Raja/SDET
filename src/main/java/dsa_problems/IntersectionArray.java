package dsa_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArray {
public ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
	int p1=0, p2=0;
	int size=arr1.length-arr2.length;
	ArrayList<Integer> arrlist = new ArrayList<Integer>();
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
}


