package cn.lsp.test;
/*
 * 测试传递引用时只是传引用，在函数中新申请的对象和原引用对象不是同一个对象
 */
public class Test7 {
	private int i=0;
	public Test7(int i) {
		this.i=i;
	}
	public static void process(Test7 obj) {
		obj=new Test7(99);
		obj.i--;
	}
	public static void main(String[] args) {
		Test7 o1=new Test7(1);
		process(o1);
		System.out.println("o1.i="+o1.i);
	}
}
