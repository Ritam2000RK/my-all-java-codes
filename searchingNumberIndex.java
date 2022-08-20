package array;
import java.util.Scanner;
public class searchingNumberIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		
		//input
		for(int i = 0;i<size;i++) {
			numbers[i] = sc.nextInt();
		}
		//input for finding the index
		int x = sc.nextInt();
		
		//output
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i] == x) {
				System.out.println("X found at index : " + i);
			}
			//this question is an example of "LINEAR SEARCH"
		}
	}

}
