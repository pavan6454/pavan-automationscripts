package IntPractice;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "the new appartMent";
		String str1 = "";
		char[] ch = str.toCharArray();
		
		for (int i=0;i<str.length();i++ ) {
			
			if(i==0 && ch[i]!=' ' ||  
	                ch[i] != ' ' && ch[i - 1] == ' ') {
				
				if(ch[i]>='a' && ch[i]<='z') {
					ch[i] = (char)(ch[i]-'a'+'A');
				}
			}
				
				else if(ch[i]>='A' && ch[i]<='Z') {
					ch[i] = (char)(ch[i]+'a'-'A');
				}
			
			str1 = new String(ch); 
		}
		System.out.println(ch);
	}

}
