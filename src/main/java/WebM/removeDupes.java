package WebM;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class removeDupes {
public static void main(String args[])
{
	int a[]= {2,3,6,6,8,9,10,10,10,12,12};
	LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();//Never forget using Wrapper class objects within brackets
for(int i=0;i<a.length;i++)
{
	lhs.add(a[i]);
	
}
Iterator<Integer> it=lhs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
}
}
