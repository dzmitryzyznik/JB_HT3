package by.ld.les04.main;
/*
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
import java.util.Scanner;
public class Task06 {
	public static void main(String[] args) {

		double S;
		double a;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сторону a");
		a = sc.nextDouble();

		S = 0;
		S = sqr(S, a);

		System.out.println("Площадь правильного шестиугольника = " + S);
	}

	public static double sqr(double S, double a) {

		S =(((Math.sqrt(3) / 4) * a * a) * 6);
		return S;
	}
}
