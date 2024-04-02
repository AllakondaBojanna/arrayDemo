package basic;

public class AnonymousArray {
	public int arraySum(int[]arr) {
		int Sum=0;
		for(int i=0;i<arr.length;i++) {
			Sum=Sum+arr[i];
		}
		return Sum;
		
		
	}

	public static void main(String[] args) {
		AnonymousArray obj=new AnonymousArray();
		int result=obj.arraySum(new int[] {2,3,4});
		System.out.println("Array Element Sum="+result);
		

	}

}
