import java.util.Scanner;
public class ReverseNumber {
  public static void main(String[] args) {
	
	  Scanner sc =new Scanner(System.in);
	    int n = sc.nextInt();
	    int counter=1;
	    int ans=0;
		while(n!=0)
	    {
	    	int reman=n%10;
	        n=n/10;
	        ans=ans*10+reman;  
	       }
		 System.out.println(ans);
}
	
}
