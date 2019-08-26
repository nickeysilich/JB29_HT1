package by.htp.les02.main;
/*
 * 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.
 */

import java.util.Scanner;

public class Task36 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое четырехзначное число:");
        a = sc.nextInt();
        int chet= 1;
        int nech = 1;
        while (a!=0) {
            int d = a % 10;
            if ( d % 2 == 0) {
                chet *= d;
                a = a/ 10;
                System.out.println(chet);
            } else {
                nech *= d;
                System.out.println(nech);
                a = a/10;
            }
        }
        System.out.println("Частное произведений четных и нечетных цифр= " + (double)chet / nech);
    }
}
