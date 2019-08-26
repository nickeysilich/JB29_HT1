package by.htp.les02.main;
/*
 * 9. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑎 ∗ 𝑏 − 𝑎𝑏 − 𝑐 𝑐𝑑 𝑐𝑑
 */

public class Task9 {

	public static void main(String[] args) {
		double a = 2;
		double b = 6;
		double c = 8;
		double d = 5;
		double n = a /c ;
		double m = b / d;
		double  znach =( n * m) - ((a * b - c)/(c *d));
		System.out.println("Значение выражения= " + znach);
	}

}
