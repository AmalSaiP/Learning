package PracticeProj;

import java.util.Scanner;

public class LongIncSub {

	static int lis(int arr[], int n) {
		int lis[] = new int[n];
		int i, j, max = 0;

		for (i = 0; i < n; i++)
			lis[i] = 1;

		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int a=sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter elements");
		for (int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n) + "\n");
	}
}
