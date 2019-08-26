package by.htp.les02.main;
/*
 * 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
 */
import java.util.Scanner;
import static java.lang.Math.sqrt;


public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длинну двух катетов" + "(Нажмите Enter после каждого числа)");
		double a;
		double b;
		double c;
		double p;
		double s;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sqrt(a*a + b*b);
		p = a + b + c;
		s = (a*b)/2;
		System.out.println("Периметр прямоугольного треугольника= " + p);
		System.out.println("Площадь прямоугольного треугольника = " + s);
	}
	}

