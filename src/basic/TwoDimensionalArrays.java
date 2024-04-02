package basic;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		int arr[][];              //Declaration
		arr=new int[2][2];       //Allocation
		arr[0][0]=10;           //Initialization
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
