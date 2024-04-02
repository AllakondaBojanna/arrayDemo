package basic;

import java.util.Scanner;

public class DynamicTwoDimensionalArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Row Size");
		int row=sc.nextInt();
		System.out.println("Enter The Column Size");
		int Column=sc.nextInt();
		int[][]arr=new int[row][Column];
		System.out.println("Enter"+row*Column+"values");
		for(int i=0;i<row;i++) {
			for(int j=0;j<Column;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("Array Elements Are");
	for(int i=0;i<row;i++) {
		for(int j=0;j<Column;j++) {
		arr[i][j]=sc.nextInt();
		System.out.println(arr[i][j]);
	}
		System.out.println();
}
		

}
}