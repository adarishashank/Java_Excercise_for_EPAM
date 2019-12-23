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
	int sum=0;
	float average;
	for(int i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	average = sum/n;
	System.out.println(sum);
	System.out.println(average);
	
}
}
