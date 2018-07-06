package WebM;

import java.util.Scanner;

public class frequency_of_sub {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i=0,c=0;
	String test=sc.nextLine();
	String s=sc.nextLine();
	while((i=test.indexOf(s,i))!=-1)
	{
		i++;
		c++;
	}
//return c
	System.out.println(c);
}
}
