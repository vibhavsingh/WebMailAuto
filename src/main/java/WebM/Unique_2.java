package WebM;

import java.util.Scanner;

public class Unique_2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String next="";
for(int i=0;i<s.length();i++)
{
	if(next.indexOf(s.charAt(i))==-1)
		next+=s.charAt(i);
}System.out.println(next);
}
	
	
	
}
