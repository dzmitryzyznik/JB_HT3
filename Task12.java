package by.ld.les04.main;
/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

 */
import java.util.Scanner;
public class Task12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите сторону x");
		double x = sc.nextDouble();
		System.out.println("Введите сторону y");
		double y = sc.nextDouble();
		System.out.println("Введите сторону z");
		double z = sc.nextDouble();
		System.out.println("Введите сторону t");
		double t = sc.nextDouble();
		
		double s = S(x, y, z, t);
		System.out.println(s);
	
	}

	public static double S (double x, double y, double z, double t) {
		double d;
		double s1;
		double s2;
		double p;
		d = Math.sqrt(x * x + y * y);
		s1 = x * y / 2;
		p = (d + z +t)/2;
		s2 = Math.sqrt(p * (p - d) * (p - z) * (p - t));
		
		return s1 + s2;
		
	}
}
