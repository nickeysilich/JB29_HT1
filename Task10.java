package by.htp.les02.main;
/*
 * 10. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 ∗ 𝑡𝑔 𝑥𝑦 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
 */

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

public class Task10 {

	public static void main(String[] args) {
		
		double x = 90;
		double y = 45;
		double znach;
		znach = ((sin(x) + cos(y))/(cos(x) - sin(y))) * tan(x*y);
		System.out.println("Значение выражения= " + znach);
		

	}

}
