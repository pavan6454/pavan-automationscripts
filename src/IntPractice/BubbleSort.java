package IntPractice;

public class BubbleSort {

	public static void main(String[] args) {
		
				// int ar[] ={3,60,35,2,45,320,5};  
				 int ar[]=new int[] {3,60,35,2,45,320,5};
				 
				 System.out.println(ar.length);
				 int temp=0;
				 for(int i=0;i<ar.length;i++) {
					 System.out.print(ar[i]+" ");
				 }
				 
				 // bubble sort code
				 for(int i=0;i<=ar.length;i++) {
					 
					 for(int j=1;j<=ar.length-1;j++) {
						 if(ar[j-1]>ar[j]) {
							 //swap elements
							 temp=ar[j-1];
							 ar[j-1]=ar[j];
							 ar[j]=temp;
						 }
					 }
				 }
				 System.out.println();
				 for(int i=0; i<ar.length;i++) {
					 System.out.print(ar[i]+" ");
				 }
				
		}

	}

