package by.ld.les04.main;
/*
 * Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
 */
import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Task05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число");
		int a = sc.nextInt();
		System.out.println("Введите второе число");
		int b = sc.nextInt();
		System.out.println("Введите третье число");
		int c = sc.nextInt();

		int minmax = minmax(a, b, c);

		System.out.println("Cумма большего и меньшего из трех чисел = " + minmax);

	}
	public static int minmax(int a, int b, int c) {
		double p;
		double S;
		int min = min(min(a, b), c);
		int max = max(max(a, b), c);

		int minmax = min + max;
		return minmax;
	}
}
