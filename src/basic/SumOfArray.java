package basic;

public class SumOfArray {
	public int arraySum(int[]arr) {
		int Sum=0;
		for(int i=0;i<arr.length;i++) {
			Sum=Sum+arr[i];
		}
		return Sum;
		
	}

	public static void main(String[] args) {
		SumOfArray obj=new SumOfArray();
		int[]a= {2,3,4,5,6};
		int result=obj.arraySum(a);
		System.out.println("Array Element Sum="+result);
		

	}

}
