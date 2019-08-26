package by.htp.les02.main;
/*
 * 33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы. 
 */
import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите один любой символ:");
        ch = sc.next().charAt(0);
         int x, p, n;
         x = ch;
         p = x -1 ;
         n = x + 1;
         char chP, chN;
         chP = (char)p;
         chN = (char)n;
         
         System.out.println("Порядковый номер символа= " + x);
         System.out.println("Предыдущий символ= " + chP);
         System.out.println("Последующий символ= " + chN);
	}

}
