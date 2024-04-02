package basic;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
//		int size=sc.nextInt();
//		int[]arr=new int [size];
//		for(int i=0;i<size;i++) {
//			System.out.println("enter element for"+i+"index");
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("Array Elements Are");
//		for(int x:arr) {
//			System.out.println(x);
//		}
		
		
		
		
		int n=sc.nextInt();
		int[]s=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println(+i+"index");
			s[i]=sc.nextInt();		
			
		
		}
		System.out.println("print elements");
		for(int v:s) {
			System.out.println(v);
		}
		
		
	}
	
}
