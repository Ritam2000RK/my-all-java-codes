package array;
import java.util.Scanner;
public class sumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		int sum = 0;
		//input
		for(int i = 0;i<numbers.length;i++) {
			numbers[i] = sc.nextInt();
		}
		
		//output (sum)
//		for(int i = 0;i<numbers.length;i++) {
//			sum = sum + numbers[i];
//		}
		
		//output (average)
		for(int i = 0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		int average = sum / size;
		System.out.println("The sum of given array is : " + average);
	}

}
