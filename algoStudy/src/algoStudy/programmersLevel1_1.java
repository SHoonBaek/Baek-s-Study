package algoStudy;

public class programmersLevel1_1 {
	
     public int solution(int num) {
    	 
    	 int count = 0;
    	 
	     while(true) {
	    	 if(num %2 == 0) {
	    		 num/=2;
	    		 count ++;
	    	 }	    	 
	    	 else if(num%2 == 1) {
	    		 num = num*3+1;
	    		 count ++;
	    		 
	    	 }
	    	 
	    	 if(num == 1) {
	    		 break;
	    	 }
	    	 else if(count > 500 ) {
	    		 
	    		 count = -1;
	    		 break;
	    	 }
	     }
    	 
    	 return count;
	 }
	
}
