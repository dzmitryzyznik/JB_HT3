package by.ld.les04.main;
/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
 */
import java.util.Scanner;
public class Task02 {

	public static int NOD(int a, int b) {
		while (a != 0 && b != 0) {
			if (a >= b) {
				a = a % b;
			}
			else {
				b = b % a;
			}
		}
		
		if (a == 0) {
			System.out.println("НОД =" + b);
			return b;
		}
		else {
			System.out.println("НОД =" + a);
			return a;
		}
		}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a;
		 int b;
		 int NOK;
		 
		 System.out.println("Введите a");
			a = sc.nextInt();
			System.out.println("Введите b");
			b = sc.nextInt();
			
			NOK = (a * b) / NOD(a,b);
			System.out.println("НОК = " + NOK);
	}

}


