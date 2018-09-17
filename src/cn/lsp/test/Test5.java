package cn.lsp.test;
/*
 * 一个函数，给出函数的系数和指数，求解求导后的系数和指数
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Test5 {
	public static void main(String[] args) throws Exception {
		int [] data= {2,3,3,2,4,1,4,0};
		int [] dao=daoshu(data);
		for(int i=0;i<dao.length;i++) {
			System.out.println(dao[i]);
		}
		
	}
	
	public static int [] daoshu(int data[]) {
		int count=0;
		int length=data.length;
		for(int k=0;k<data.length;k++) {
			if(data[k]==0) count++;
		}
		int [] daoshu=new int[length-count*2];
		int j=0;
		for(int i=0;i<data.length;i=i+2) {
			if(data[i+1]==0) {
//				daoshu[j++]=0;
				break;
			}else {
				daoshu[j++]=data[i]*(data[i+1]);
				daoshu[j++]=data[i+1]-1;
			}
		}
		return daoshu;
	}
	
	
	public static int cal26(String num) {
		int len = num.length();
		if (len == 1) {
			return 1;
		} else if (len == 2) {
			if (Integer.parseInt(num) <= 26) {
				return 2;
			} else {
				return 1;
			}
		} else {
			return cal26(num.substring(1, len)) + ((cal26(num.substring(0, 2))) - 1) * cal26(num.substring(2, len));
		}
	}

	public static String convert(String str, int right) throws Exception {
		// 请在此添加代码
		int length = str.length();
		char[] _char = str.toCharArray();
		char[] new_char = new char[length];
		int j = 0;
		for (int i = 0; i < _char.length; i++) {
			if ((int) _char[i] >= 97 && (int) _char[i] <= 122) {
				new_char[j++] = _char[i];
			}
		}
		for (int k = 0; k < j; k++) {
			if (new_char[k] + right <= 122) {
				new_char[k] = (char) ((int) new_char[k] + right);
			} else {
				new_char[k] = (char) ((int) new_char[k] + right - 26);
			}
		}
		return String.valueOf(new_char);
	}

}
