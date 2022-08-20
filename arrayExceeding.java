package array;
import java.util.*;
public class arrayExceeding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		long sum = 0;
		//input
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		//output
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
