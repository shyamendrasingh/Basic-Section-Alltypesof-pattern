import java.util.*;

public class GCD {
   public static void main(String[] args) {
	 
	   Scanner sc=new Scanner(System.in);
	   int divident=sc.nextInt();
	   int divisor=sc.nextInt();
	  
	 //  int remainder=divisor%divident;
	
	 while(divident%divisor!=0)
	 {
		int remainder=divident%divisor;
		 divident=divisor;
		 divisor=remainder;
	 }
	 System.out.println(divisor);
}

}
