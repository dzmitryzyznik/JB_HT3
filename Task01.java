package by.ld.les04.main;
/*
 *  Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
 */
import java.util.Scanner;
public class Task01 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Введите A1");
			double A1 = sc.nextDouble();
			System.out.println("Введите A2");
			double A2 = sc.nextDouble();
			System.out.println("Введите B1");
			double B1 = sc.nextDouble();
			System.out.println("Введите B2");
			double B2 = sc.nextDouble();
			System.out.println("Введите C1");
			double C1 = sc.nextDouble();
			System.out.println("Введите C2");
			double C2 = sc.nextDouble();
			
			double AB;
			double AC;
			double BC;
			double S;
			
			AB = Math.sqrt((A1 - B1) * (A1 - B1) + (A2 - B2) * (A2 - B2));
			AC = Math.sqrt((A1 - C1) * (A1 - C1) + (A2 - C2) * (A2 - C2));
			BC = Math.sqrt((B1 - C1) * (B1 - C1) + (B2 - C2) * (B2 - C2));
			
			if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
				System.out.println("Треугольник не существует");
			else {

				S = S(AB, AC, BC);
				System.out.println("Площадь = " + S);
	}
	}
			public static double S(double AB, double AC, double BC) {
				double p;
				double S;
				p = (AB + AC + BC) / 2;
				S = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
				return S;

}
}
