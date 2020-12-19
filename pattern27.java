
import java.util.Scanner;
public class pattern27 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
   
		int val;
		
		int nsp=n-1;
		int nst=1;
		//works
		int row=1;
		while(row<=n)
		{    
			val=1;
			//spaces
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print("\t");
			}
			//stars
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print(val+"\t");
				if(cst<=nst/2)
				{
					val++;
				}
				else
				{
					val--;
				}	
			}
			//prepation
			System.out.println(" ");
			nsp=nsp-1;
			nst=nst+2;
			row++;
		}	
	}
}

