package com.jsp;

public class MyThread   {             
	
	 
	public static void main(String[] args) {
		
		char ch = 'a';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(ch+" ");ch++;
				}
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			
		}
		
	}

}


// a * b *
// c * d * *
// e * f * * *
// g * h * * * *
// i * j * * * * *