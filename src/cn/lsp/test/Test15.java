package cn.lsp.test;
/*
 * 求一元二次方程的解
 */
import java.util.Scanner;

public class Test15 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int a, b, c;
		while (cin.hasNextInt()) {
			a = cin.nextInt();
			b = cin.nextInt();
			c = cin.nextInt();
			// System.out.println(a);
			// System.out.println(b);
			// System.out.println(c);
			if (b * b - 4 * a * c < 0) {
				System.out.println(0);
			} else if (b * b - 4 * a * c == 0) {
				System.out.println(-b / (2 * a));
			} else if (b * b - 4 * a * c > 0) {
				System.out.format("%.4f %.4f",(((-b) - Math.sqrt(b * b - 4 * a * c) )/(2*a)),(((-b) + Math.sqrt(b * b - 4 * a * c) )/(2*a)) 
						);
			}
		}

	}
}
