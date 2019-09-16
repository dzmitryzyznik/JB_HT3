package by.ld.les04.main;
/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
import java.util.Scanner;
public class Task09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите первое число");
		int a = sc.nextInt();
		System.out.println("Введите второе число");
		int b = sc.nextInt();
		System.out.println("Введите третье число");
		int c = sc.nextInt();
		int d = 0;

		int NOK = NOD(a, b, d);

	}

	public static int NOD(int a, int b, int d) {
		while (a != 0 && b != 0) {
			if (a >= b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}

		if (a == 1) {
			System.out.println("Числа взаимно простые");
			return a;
		} else if (b == 1) {
			System.out.println("Числа взаимно простые");
			return b;

		} else {
			System.out.println("Числа не взаимно простые");
			return d;
		}

	}

}
