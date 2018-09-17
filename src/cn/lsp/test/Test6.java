package cn.lsp.test;
/*
 * 测试静态代码块、静态变量的初始化
 */
public class Test6 {
	static {int x=5;}
	static int x,y;
	public static void main(String[] args) {
		x--;
		myMethod();
		System.out.println(x+y+ ++x);
	}
	public static void myMethod() {
		y=x++ + ++x;
	}
}
