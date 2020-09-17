package IntPractice;

public class S4 {

	public static void main(String[] args) {
		 int c =0;
		 String S="pavanp";
		    String t = "";
		    for (int i = 0; i < S.length() - 1; i++) {
		        for (int j = i + 1; j < S.length(); j++) {
		            if (S.charAt(i) == S.charAt(j) && !t.contains(S.charAt(j) + "")) {
		            	
		               //t+=S.charAt(i);
		               c=c++;
		                System.out.println(S.charAt(i) +" count is "+c++);
		            }
		        }
		    }
		   
		}
	}

