package assignment;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No of elements: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[100];
		int x;
		System.out.println("Insert elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			x=arr[i];
			arr1[x]++;
		}
		for(int i=0;i<size;i++)
		{
			if(arr1[i]>0)
			{
			System.out.println(i+" "+arr1[i]);

			}
		}
	}

}
