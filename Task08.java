package by.ld.les04.main;
/*
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
import java.util.Collections;
public class Task08 {
	public static void main(String[] args) {

		int[] arr = { 652, 6574, 456, 4564567, 6756746, 76, 4564, 8766, 5754 };
		int a;
		int b;
		a = max(arr);
		b = submax(arr,a);
		System.out.println(b);

	}
	public static int max(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
	}
		return max;
}
    public static int submax(int [] arr, int max){
	int submax = 0;
	for (int i = 0; i < arr.length;i++){
		if (submax < arr[i] && max > arr[i]) {
			submax = arr[i];
		}
	}
	return submax;
	}
}
