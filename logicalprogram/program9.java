package logicalprogram;

import java.util.ArrayList;

public class program9 {
//	static ArrayList arr1=new ArrayList();
	// static int count=0;
	 static int second;
	public static void main(String[] args) {
	
//Write a program to Print the Second Even
//Armstrong Number in the range of 100-10000
        
		 ArrayList arr1=new ArrayList();
		 int count=0;
		 //static int second;
		
		for(int j=100;j<=10000;j++)
		{
			int no=j;
			int t1=no;
			int len=0;
			
			while(t1>0)
			{
				len=len+1;
				t1=t1/10;
			}
			
			int t2=no;
			int rem=0;
			int arm=0;
			while(t2>0)
			{
				int mul=1;
				rem=t2%10;
				for(int i=1;i<=len;i++)
				{
					mul=mul*rem;
				}
				arm=arm+mul;
				t2=t2/10;
			}
			if(arm==no)
			{
				//System.out.println(no+" is amstrong");
				arr1.add(no);
				if(no%2==0)
				 count++;
				if(count==2)
				{
					second=no;
				}
			}
			
		}	
			
			System.out.println(second+" second even number");
		//System.out.println(arr1);	
			
			
		
		
		
	}

}
