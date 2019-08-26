package by.htp.les02.main;
/*
 * 8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑏+√𝑏2 +4𝑎𝑐−𝑎3𝑐+𝑏−2
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task8 {

	public static void main(String[] args) {
		double a = 4;
		double b = 6;
		double c = 8;
		double znach;
		
		znach = ((b + sqrt(b * b + 4 * a * c))/ (2 * a)) - (pow(a, 3) * c + pow(b, -2));
		System.out.println("Значение выражения= " + znach);
		
		
	}

}
