package IntPractice;

public class S2 {

	static int temp=0,temp1=0;
	public static void main(String[] args) {
		String k="pavaan";
		char[] ch = k.toCharArray();
		
		for(int i=0;i<k.length();i++) {
			
			if(ch[i]==ch[i+1]) {
				System.out.println("duplicate found "+ch[i]);
				temp++;
				temp1=temp++;
				System.out.println(temp1);
				break;
				
				
			}
			//System.out.println(temp);
		}
	}

}
