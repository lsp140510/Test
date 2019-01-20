package cn.lsp.test;

/**
 * @version
 * @author lsp 计算从1到n中数字1出现的次数，方法是将每个数字从int型转换成char型，然后计算等于1的次数
 */
public class Test10 {
	public static void main(String[] args) {
		System.out.println(CountNumberOne(100));
	}

	// 计算出现1的次数，将每个数字传到IntToString中计算
	public static int CountNumberOne(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += IntToString(i);
		}
		return sum;
	}

	// 将int型转换成string，变成char数组，对数组中每个字符判断是不是等于1
	public static int IntToString(int number) {
		String string = String.valueOf(number);
		char[] array = string.toCharArray();
		int numberOfOne = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '1') {
				numberOfOne++;
			}
		}
		return numberOfOne;
	}
}
