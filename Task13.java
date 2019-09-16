package by.ld.les04.main;
/*
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Task13 {

	public static void main(String[] args) {
		
		int[] arr;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите N");
		int N = sc.nextInt();
		
		
		arr = arr(N);
		System.out.println(Arrays.toString(arr));
		
	}
	public static int [] arr (int N) {
		
		String s = Integer.toString(N);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = N % 10;
            N /= 10;
        }
        
		return arr;
	}

	}

