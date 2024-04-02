package basic;

public class ArrayTest {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};
		System.out.println("basic for loop");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
		}
		System.out.println("forEach loop");
		
		for(int x:arr){
		System.out.println(x);
		
		
		
		
		
		}

	}

}
