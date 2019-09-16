package by.ld.les04.main;
/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Task15 {

	public static void main(String[] args) {
		
		int[] arr;
		int[] arr2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите K");
		int K = sc.nextInt();
		System.out.println("Введите N");
		int N = sc.nextInt();

		arr = arr(N);
		arr2 = arr2(K);
		
		if (arr.length > arr2.length) {
			System.out.println(Arrays.toString(arr));
		} else if (arr.length < arr2.length) {
			System.out.println(Arrays.toString(arr2));
		} else {
			System.out.println("равны");
		}
	}

	public static int[] arr(int K) {

		String s = Integer.toString(K);
		int[] arr = new int[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			arr[i] = K % 10;
			K /= 10;
		}

		return arr;
	}

	public static int[] arr2(int N) {

		String s = Integer.toString(N);
		int[] arr2 = new int[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			arr2[i] = N % 10;
			N /= 10;
		}

		return arr2;

	}

}
