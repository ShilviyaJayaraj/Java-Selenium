package week2.day1;

import java.util.Arrays;

public class MissingElements {

	/*
	 * input range is between 1to8
	 * in loop iterate till arr length
	 * if i!=arr[i] then print the value
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};

		 Arrays.sort(arr);
		 int value;
		for(int i=0;i<arr.length;i++) {
			value = i+1;
			if(value!=arr[i]) {
				System.out.println(value);
				break;
			}
		}
		
	}

}
