package IntPractice;

public class A {
	
	public static void main(String[]args) {
		String rev="aba";
		String act="aba";
		char[] ch = rev.toCharArray();
		System.out.println("character length is "+ch.length);
		System.out.println("Str length is "+rev.length());
		String rev1="";
		for(int i=rev.length()-1;i>=0;i--) {
			rev1+=ch[i];
		}
		if(rev1.equals(act)) {
			System.out.println("pali");
		}
		
		System.out.println("new character "+rev1);
	}

}
