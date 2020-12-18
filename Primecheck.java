import java.util.Scanner;
public class Primecheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		 int div=2;
		 boolean flag=true;
		 while(div<=n-1)
		 {
			 if(n%div==0)
				 {
				   flag= false;
				 }
			 div=div+1;
		 }
		if(flag==true)
		System.out.println("prime");
		else
			System.out.println("not prime");
	}
}
