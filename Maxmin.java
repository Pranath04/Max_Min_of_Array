package maxmin;

import java.util.Scanner;

public class Maxmin{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
        int n= scanner.nextInt();
        System.out.println("Enter array Elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        scanner.close();
        System.out.print(minmax(arr));
	}
	static  int minmax(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		int sum=min+max;
		return sum;
		
	}
	
}