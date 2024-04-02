package basic;

public class CoadingBat {
	int findSmallest(int[] values) {
		  int minIndex = 0;  // start with 0th element as min
		  for (int i=1; i<values.length; i++) {
		    if (values[i] < values[minIndex]) {
		      minIndex = i;
		    }
		  }
		  return minIndex;
}

	public static void main(String[] args) {
		CoadingBat obj=new CoadingBat();
		int[]a= {2,3,4};
		int result=obj.findSmallest(a);
		System.out.println(result);
		

	
		
	}
}