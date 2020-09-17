package IntPractice;

public class W2 {
	private String col="kvg";
	private int id;
	//getter method
	public String getCollege() {
		return col;
	}
	//setter method
	public void setId(int id) {
		this.id=id;
		System.out.println(id);
	}
	public static void main(String[] args) {
		W2 obj=new  W2();  
		//System.out.println(i);
		 System.out.println(obj.getCollege());  
		 obj.setId(222);
		 
	}

}
