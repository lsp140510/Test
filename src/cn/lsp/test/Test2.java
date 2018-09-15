package cn.lsp.test;

/**
 * 
 * @author lsp 
 * 求最大公约数和最小公倍数
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println(gcdA(25, 10));
		System.out.println(gcdB(25, 10));
		System.out.println(lcm(25, 10));
	}

	// 辗转相除法
	// a除以b得余数c，b除以c得余数d，一直除，直到余数为0，则最后的除数为最大公约数
	public static int gcdA(int numberA, int numberB) {
		if(numberA==numberB) {
			return numberA;
		}
		if (numberA%numberB==0) {
			return numberB;
		}else if (numberA<numberB) {
			return gcdA(numberB, numberA);
		}else {
			return gcdA(numberB, numberA%numberB);
		}
	}

	// 更相减损术
	//和辗转相除法类似，把除法换成减法
	public static int gcdB(int numberA, int numberB) {
		if (numberA == numberB)
			return numberA;
		if (numberA < numberB)
			// 调用时二者可以交换位置
			return gcdB(numberA, numberB - numberA);
		else {
			// 调用时二者可以交换位置
			return gcdB(numberB, numberA - numberB);
		}
	}
	//求最小公倍数，ab乘积除以最大公约数
	public static int lcm(int numberA,int numberB) {
			return numberA*numberB/gcdA(numberA, numberB);
	}
}
