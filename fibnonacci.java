import java.util.Scanner;
public class fibnonacci {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		 int n= sc.nextInt();
		 
		 int f1=0,f2=1;
		int counter=1;
		 while(counter<=n+1)
		 {
			int f=f1+f2;
			 f1=f2;
			 f2=f; 
			 System.out.print(f1);
			 counter++;
		 }
		
		
	}
	
	
}
