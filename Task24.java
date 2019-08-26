package by.htp.les02.main;
/*
24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
 */

import static java.lang.Math.tan;

public class Task24 {

	public static void main(String[] args) {
        int a, b, alfa;
        a = 12;
        b = 8;
        alfa = 45;
        double h = ((a - b) / 2 ) * tan(alfa);
        double S = ((a + b) / 2) * h;
        System.out.println("Площадь равнобедренной трапеции = " + S);
    }
}

