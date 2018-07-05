package WebM;

import java.util.Scanner;

public class fib_check {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0,b=1,c=0;
		while(c<=num)
		{
			System.out.println(a+":");
			System.out.println(b+":");
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
		
		
	}
	

}
