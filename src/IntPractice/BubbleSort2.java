package IntPractice;

public class BubbleSort2 {

	public static void main(String[] args) {
		
				int ar[] ={3,60,35,2,45,320,5};  
				 //int ar[]=new int[] {3,60,35,2,45,320,5};
				//int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
				 System.out.println(ar.length);
				 int temp=0;
				 for(int i=0;i<ar.length;i++) {
					 System.out.print(ar[i]+" ");
				 }
				 
				 // bubble sort code
				 for(int i=0;i<ar.length;i++) {
					 
					 for(int j=0;j<ar.length;j++) {
						 if(ar[i]<ar[j]) {
							 //swap elements
							 temp=ar[i];
							 ar[i]=ar[j];
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

