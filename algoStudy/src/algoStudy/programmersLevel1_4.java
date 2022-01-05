package algoStudy;

import java.util.*;


public class programmersLevel1_4 {
	
	public int[] solution(int[] arr, int divisor) {
	
		ArrayList a = new ArrayList<>();
		a.add(arr[0]);
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				a.add(arr[i]);
			}
		}
		
		int [] result = new int [a.size()];
		
		for(int i=0; i<a.size(); i++) {
			result[i] = (int) a.get(i);
		}
		
		return result;
			
		   
	}
}
