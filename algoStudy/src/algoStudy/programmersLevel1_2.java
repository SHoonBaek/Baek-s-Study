package algoStudy;
import java.util.*;

public class programmersLevel1_2 {
	
	public int solution(int left, int right) {
		int result = 0;
		ArrayList arr = new ArrayList();
		
		for(int i = 1; i*i<=right; i++) {
			if(i*i >=left) {
				arr.add(i*i);
			}
		}
		
		for(int i = left; i<=right; i++) {
			if(arr.contains(i)) {
				result -= i;
			}
			else {
				result +=i;
			}
		}
		
		return result;
    }
	
}
