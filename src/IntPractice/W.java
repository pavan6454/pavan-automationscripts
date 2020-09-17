package IntPractice;

public class W {
	public static void main(String[] args) {
		//autoboxing
		int a= 10;
		Integer a1=a;
		System.out.println(a1);
		
		//unboxing
		Integer b = new Integer(a);
		int c=b;
		System.out.println(c);
		String binarynumber="10101";
		int cc=Integer.parseInt(binarynumber,2);
		
		System.out.println(cc);
	}

}
