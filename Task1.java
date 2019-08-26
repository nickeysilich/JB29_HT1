package by.htp.les02.main;

/*
 * 1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
 */
public class Task1 {

	public static void main(String[] args) {
		int x, y;
		x = 65;
		y = 32;
		
		int sum= x + y;
		int razn= x - y;
		int proiz= x * y;
		double chas= (double)x / y;
		
		System.out.println("Sum=" + sum);
		System.out.println("Razn=" + razn);
		System.out.println("Proiz=" + proiz);
		System.out.println("Chas=" + chas);
	}

}
