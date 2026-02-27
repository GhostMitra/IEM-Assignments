import java.lang.*;
import java.util.*;

class Job
{
	String id;
	int deadline, profit;
}	

class MergeSort 
{
	static void slot(Job arr[],int n)
	{
		int size=n;
		int max=arr[0].deadline;
		for(int i=1;i<n;i++)
		{
			if(arr[i].deadline>max)
				max=arr[i].deadline;
		}
		String sequence[] = new String[max-1];
		for(int i=0;i<max;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==arr[j].deadline)
				{
					sequence[i]=arr[j].id;
					break;
				}
			}
		}
		System.out.println("The job sequence is ");
		for (int i=0;i<max;i++)
			System.out.print(arr[i].id+",\t");
	}
	
	static void mergesort(Job arr[]) 
	{
		int n = arr.length;
		if (n < 2)
			return;
		int mid = n / 2;
		Job left[] = new Job[mid];
		Job right[] = new Job[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = arr[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = arr[i];
		mergesort(left);
		mergesort(right);
		merge(arr, left, right);
	}

	public static void merge(Job arr[], Job left[], Job right[]) 
	{
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) 
		{
			if (left[i].profit >= right[j].profit) 
			{
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < nL) 
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) 
		{
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
public class Assignment_5
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of jobs in hand");
		int n=sc.nextInt();
		
		Job j[]=new Job[n];		
		for (int i=0;i<n;i++)
		{
			System.out.println("enter the name, deadline and profit of the job ="+i);
			j[i] = new Job();
			j[i].id=sc.next();
			j[i].deadline=sc.nextInt();
			j[i].profit=sc.nextInt();
		}
		MergeSort m=new MergeSort();	
		m.mergesort(j);
		System.out.println("Jobs after profit sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(j[i].id+"\t"+j[i].profit);
		}
		m.slot(j,n);
	}
}