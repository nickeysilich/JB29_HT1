package by.htp.les02.main;
/*
 * 32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). 
 * Какое время будут показывать часы через р ч q мин r с? 
 */

import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		int ch = 22;
		int min = 43;
		int sec = 21;
		int p = 28;
		int q = 3;
		int r = 4;
		int x1, x2, x3, x4;
		int y1, y2, y3, y4;
		
		x1 = ch * 3600 + min * 60 + sec;
		x2 = p * 3600 + q * 60 + r;
		x3 = x1 + x2;
		
		y1 = x3 / 3600;
		y2 = (x3 - (y1 * 3600)) / 60;
		y3 = x3 - (y1 * 3600) - (y2 * 60);
		
		if (y1 <=0 | y1>=23) {
			y4 = y1 % 24;
			System.out.println(y4 + " часов " + y2 + " минут " + y3 + " секунд ");
		}
		else {
			System.out.println(y1 + " часов " + y2 + " минут " + y3 + " секунд ");
		}
	}
}
       
	
	
