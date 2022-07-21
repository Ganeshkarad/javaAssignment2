package logicalprogram;

public class program8 {

	public static void main(String[] args) {
//Write a program to Print the 
//Armstrong Numbers from 50-1000.

	
	for(int i=50;i<=1000;i++) {
		int num=i;
		int sum=0;
		int re;
		while(num>0) {
			re=num%10;
			sum=sum+(re*re*re);
			num=num/10;	
		}
		
		if(sum==i) {
			System.out.println("amstrong number"+sum);
		}
	}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	}


