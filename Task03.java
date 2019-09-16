package by.ld.les04.main;
/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
import java.util.Scanner;
public class Task03 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Введите первое число");
			int a = sc.nextInt();
			System.out.println("Введите второе число");
			int b = sc.nextInt();
			System.out.println("Введите третье число");
			int c = sc.nextInt();
			System.out.println("Введите четвертое число");
			int d = sc.nextInt();
          
			int NOD;

        NOD = findNod (a, b, c, d);
        System.out.println(NOD);
    }

    public static int findNod (int a, int b, int c, int d){
        int NOD;

        if (a > b && a > c && a > d) {
            NOD = a;
        }
        else if (b > a && b > c && b > d){
        	NOD = b;
        }
        else if (c > a && c > b && c > d){
        	NOD = c;
        }
        else {
        	NOD = d;
        }

        while (a % NOD !=0 || b % NOD != 0 || c % NOD != 0 || c % NOD != 0) {
            NOD--;
        }
        return NOD;
    }
}
