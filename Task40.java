package by.htp.les02.main;

import java.util.Scanner;

/*39*40*. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.
*/

public class Task40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите величину x:");
        int  x = sc.nextInt();
        int rez1;
		int rez2;
		
		rez1 = x * (-2 + x * (3 - 4 * x));
		rez2 = x * (2 + x * (3 + 4 * x)) + 1;
		
		System.out.println("Результат вычисления1: " + rez1);
		System.out.println("Результат вычисления2: " + rez2);

	}

}
