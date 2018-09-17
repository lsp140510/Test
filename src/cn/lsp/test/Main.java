package cn.lsp.test;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static String f(int m,int n){
		StringBuffer sb = new StringBuffer();	// 保存结果
		List<Integer> lis = new ArrayList<Integer>();	// 记载全部余数
		String s = m/n+".";	// 保存整数分部
		m = m%n;		// 失掉余数
		while(m!=0){
			if(lis.contains(m)){
				int i=0;	// 失掉环循节开始的置位 i
				for(;i<sb.length();i++){
					if(sb.charAt(i)-'0'==m*10/n){
						break;
					}
				}
				sb.insert(i,"(");	// 为环循节加添"[  ]"
				sb.insert(sb.length(),")");
				break;
			}else{
				lis.add(m);		// 加添商
				sb.append(m*10/n);	// 加添结果素元
			}
			m = m*10%n;	// 失掉余数
		}
		return sb.insert(0, s).toString();
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
        if(m%n==0){
            System.out.println(m/n);
        }else{
            System.out.println(f(m,n));
        }
		
	}
}
   