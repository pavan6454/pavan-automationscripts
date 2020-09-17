package IntPractice;

public class S {

	public static void main(String[] args) {
		String s="pavaan";
		int t=0;
		for (int i = 0; i < s.length(); i++) {

	        for (int j = 1; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                t++;
	                break;
	                
	            }
	            else
	            	t=0;
	            
	        }
	       
		}
		
	}

}
