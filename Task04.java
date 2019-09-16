package by.ld.les04.main;
/*
 * Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
 */
import java.util.Scanner;
public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число");
		int a = sc.nextInt();
		System.out.println("Введите второе число");
		int b = sc.nextInt();
		System.out.println("Введите третье число");
		int c = sc.nextInt();

		int NOK = NOK1(a, NOK1(b, c));
		System.out.println(NOK);

	}

	public static int NOD(int a, int b) {

		int x;
		while (a != 0 && b != 0) {
			a %= b;
			x = a;
			a = b;
			b = x;
		}
		return a + b;
	}

	public static int NOK1(int a, int b) {

		int d;
		d = a / NOD(a, b) * b;

		return d;

	}

	}

