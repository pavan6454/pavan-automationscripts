package IntPractice;

public class B {
	
	public static void main(String[]args) {
		String str="the new appartMent";
	
		char[] ch = str.toCharArray();
		System.out.println("character length is "+ch.length);
		
		
		String str1="";
		for(int i=0;i<str.length();i++) {
			
			// If first character of a 
            // word is found 
            if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') 
            { 
  
                // If it is in lower-case 
                if (ch[i] >= 'a' && ch[i] <= 'z') 
                { 
  
                    // Convert into Upper-case 
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
  
            // If apart from first character 
            // Any one is in Upper-case 
            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
  
                // Convert into Lower-Case 
                ch[i] = (char)(ch[i] + 'a' - 'A');  
            
         // Convert the char array to 
            // equivalent String 
            str1 = new String(ch); 
        } 
				
		System.out.println("new character is --> "+str1);
	}

}
