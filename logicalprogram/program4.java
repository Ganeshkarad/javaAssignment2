package logicalprogram;

public class program4 {

	public static void main(String[] args) {
		
//Write a program to check if the given number
//		is a Palindrome Number or not.
	
		int i=121;//121
		
		int R,D,Sum=0;
		
		D=i;
		
		while(i>0) {
		
		
	      R= i%10; // reminder    5%2=1/// 
	      
	      Sum = (Sum*10)+R;
	      
	    i= i/10;// divde   5/2=2.5 pan int 2 get
	    }
		
		if ( D==Sum) {
			System.out.println("palindrome number");
		}else { 
			System.out.println("not palindrome number");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
