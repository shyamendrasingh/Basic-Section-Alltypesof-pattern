import java.util.*;
public class pattern32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int nr=2*n-1;
		int nst=1;
		int nsp=0;
		int val=1;
		 int row=1;
		 while(row<=2*n-1)
		 {  
			 
			 for(int cst=1;cst<=nst;cst++)
			 {	
				 if(cst%2!=0)
				 {
					 System.out.print(val);
				 }
				 else
				 {
					 System.out.print("*");
				 }		 
			 }
			  System.out.println();
			 if(row<=nr/2)
			 {
				 nst=nst+2;	
				 val=val+1;	
			 }
			 else
			 {
				 nst=nst-2;
				 val--;
			 }  
			 row++;
			 
			 
			
			 
		 }
		
	}
}
