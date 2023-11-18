
import java.util.Arrays;

public class Program {
	
	public static void insertionSort(int arr[], int N) {
		int count =0;
		for(int i =1 ;i< N ; i++) {
			int temp = arr[i];
			int j;
			count++;
			for(j = i-1 ;  j>=0 && arr[j]<temp ; j--)
			{
				
				if(temp>arr[j])
					arr[j+1]= arr[j];
				
			}
			arr[j+1]= temp;
		}
	
	}
	
	public static void main(String[] args) {
		//int arr[] = {11,22,33,44,55,66};
		int arr[] = {55,44,22,66,11,33};
		System.out.println("Array before sort : "+ Arrays.toString(arr));
		 insertionSort(arr, arr.length);
		System.out.println("Array before sort : "+ Arrays.toString(arr));

	}
}
