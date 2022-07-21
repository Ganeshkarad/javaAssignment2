package logicalprogram;

public class program10 {

	public static void main(String[] args) {
//Write a program to Print all the Numbers between 1-10
//which is Prime Number, Odd Number and also an Armstrong Number.
	
		
		
		
	for(int i=1;i<=10;i++) {
		int j;
		int count=0;
		for( j=1;j<=i;j++) {
			if(i%j==0)
			{
			count++;
				
		}}
	
		if(count==2) {
			System.out.println(i+" prime number");
			
		}
		int num=i;
		int sum=0;
		int re;
		while(num>0) {
			re=num%10;
			sum=sum+(re*re*re);
			num=num/10;	
		}
		
		if(sum==i) {
			System.out.println(sum+" amstrong number");
			
		}
		
		int k=i;
		if(k%2!=0) {
			System.out.println(k+ " odd number");
		}
		
		
	}
				
				
				
				
				
				
				
				
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		}


