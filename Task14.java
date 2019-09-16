package by.ld.les04.main;
/*
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {
		
		int[] arr;
		int[] arr2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите A");
		int A = sc.nextInt();
		System.out.println("Введите B");
		int B = sc.nextInt();

		arr = arr(A);
		arr2 = arr2(B);
		if (arr.length > arr2.length) {
			System.out.println(Arrays.toString(arr));
		} else if (arr.length < arr2.length) {
			System.out.println(Arrays.toString(arr2));
		} else {
			System.out.println("равны");
		}
	}

	public static int[] arr(int A) {

		String s = Integer.toString(A);
		int[] arr = new int[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			arr[i] = A % 10;
			A /= 10;
		}

		return arr;
	}

	public static int[] arr2(int B) {

		String s = Integer.toString(B);
		int[] arr2 = new int[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			arr2[i] = B % 10;
			B /= 10;
		}

		return arr2;

	}

}
