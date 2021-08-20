package algoStudy;

import java.util.*;


public class programmersLevel1_3 {
	
		public int[] solution(int[] arr, int divisor) {
	     
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        for(int i = 0; i<arr.length; i++) {
	        	if(arr[i] % divisor == 0) {
	        		list.add(arr[i]);
	        	}
	        	
	        }
	        Collections.sort(list);
	        int [] answer = new int [list.size()];
	        int [] answer2 = {-1};
	        
	        for(int i = 0; i<list.size(); i++) {
	        	answer[i] = list.get(i);
	        }
	        if(answer.length == 0) {
	        	return answer2; 
	        }
	        return answer;
	    }
	
	
}
