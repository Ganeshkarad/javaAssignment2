package logicalprogram;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Write a program to print if the given 
//  number is an Armstrong number or not.		
		
		
		int num=153,re,k;
		k=num;
		int sum=0;
		
		while(num>0)
		{
			re=num%10;
			sum=(re*re*re)+sum;
		   num=num/10;
			
		}
		if(k==sum)
		{
			System.out.println("armstrong number"+sum);
		}
		else
		{
			System.out.println("not a amstrong");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
