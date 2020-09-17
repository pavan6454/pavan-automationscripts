package IntPractice;

public class S3 {

	public static void main(String[] args) {
		String s="pavaan";
		
		System.out.println(s.charAt(0));
		//System.out.println(s.indexOf(2));
		System.out.println(s.valueOf(1));
		for (int i = 0; i < s.length(); i++) {

	        for (int j = i+1; j < s.length(); j++) {
	        	int t=0;
	            if(s.charAt(i)==s.charAt(j))
	            {
	            	
	            //	System.out.println("Duplicate found "+s.charAt(i)+" for iteration "+i);
	                t++;
	              
	              //  System.out.println(t);
	            }
	            
	        }
	      
		}
		
	}

}
