package cn.lsp.test;
/**
 * @author lsp
 * 网易校招编程题，计算密码是否符合要求
 */
import java.util.Arrays;
import java.util.Scanner;

public class WangYi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String space = sc.nextLine();
		String x;
		int i = 0;
		String[] strings = new String[n];
		String[] flag = new String[n];
		while (i < strings.length) {
			x = sc.nextLine();
			if (i < n) {
				strings[i] = x;
				i++;
			} else {
				break;
			}

		}
		i = 0;
		while (i < n) {
			if (strings[i].indexOf("password") != -1) {
				flag[i] = "no";
				i++;
				continue;
			}
			if (strings[i].indexOf("admin") != -1) {
				flag[i] = "no";
				i++;
				continue;
			}
			if (strings[i].indexOf("qwerty") != -1) {
				flag[i] = "no";
				i++;
				continue;
			}
			if (strings[i].indexOf("iloveyou") != -1) {
				flag[i] = "no";
				i++;
				continue;
			}
			if (strings[i].indexOf("112233") != -1) {
				flag[i] = "no";
				i++;
				continue;
			}
			boolean small = false;
			boolean big = false;
			boolean num = false;
			boolean other = false;
			if (strings[i].length() < 8) {
				flag[i] = "no";
				i++;
				continue;
			}
			char[] tmp = new char[strings[i].length()];
			tmp = strings[i].toCharArray();
			for (int j = 0; j < strings[i].length(); j++) {
				if (tmp[j] >= 'a' && tmp[j] <= 'z') {
					small = true;
					if ((j + 2) < strings[i].length() - 1) {
						if (tmp[j + 1] >= 'a' && tmp[j + 1] <= 'z' && tmp[j + 2] >= 'a' && tmp[j + 2] <= 'z') {
							if (tmp[j] == (tmp[j + 1] + 1) && tmp[j + 1] == (tmp[j + 2] + 1)) {
								flag[i++] = "no";
								break;
							}
						}
					}

				} else if (tmp[j] >= 'A' && tmp[j] <= 'Z') {
					big = true;
					if ((j + 2) < strings[i].length() - 1) {
						if (tmp[j + 1] >= 'A' && tmp[j + 1] <= 'Z' && tmp[j + 2] >= 'A' && tmp[j + 2] <= 'Z') {
							if (tmp[j] == (tmp[j + 1] + 1) && tmp[j + 1] == (tmp[j + 2] + 1)) {
								flag[i++] = "no";
								break;
							}
						}
					}

				} else if (tmp[j] >= '0' && tmp[j] <= '9') {
					small = true;
					if ((j + 2) < strings[i].length() - 1) {
						if (tmp[j + 1] >= '0' && tmp[j] <= '9' && tmp[j + 2] >= '0' && tmp[j + 2] <= '9') {
							int num1 = Integer.parseInt(tmp[j] + "");
							int num2 = Integer.parseInt(tmp[j + 1] + "");
							int num3 = Integer.parseInt(tmp[j + 2] + "");
							if (num1 + num3 == (2 * num2)) {
								flag[i++] = "no";
								break;
							}
						}
					}

				} else {
					other = true;
				}
			}
			if (!(small && big && num && other)) {
				flag[i++] = "no";
				continue;
			} else {
				flag[i++] = "yes";
				continue;
			}

		}
		for (int k = 0; k < flag.length; k++) {
			System.out.println(flag[k]);
		}
	}
}