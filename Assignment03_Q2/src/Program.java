import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		Stack st = new Stack(7);
		System.out.println("Array :"+ Arrays.toString(arr));
		for(int i = 0; i<arr.length;i++) {
			st.push(arr[i]);
		}
		for(int i = 0; i<arr.length;i++) {
			arr[i]=st.pop();
		}
		System.out.println("Array after reverse :"+ Arrays.toString(arr));

	}

}
