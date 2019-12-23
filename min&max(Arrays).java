// package epam;
import java.util.*;
public class program1 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[] a = new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int ele=sc.nextInt();
	int flag=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]==ele)
		{
		    System.out.println(i+1);
		    flag=1;
		    break;
		}
	}
	if(flag==0)
	{
	    System.out.println("-1");
	}
}
}
