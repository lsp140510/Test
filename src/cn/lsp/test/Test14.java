package cn.lsp.test;
/**
 * 
 * @author lsp
 * @category 多线程学习测试
 *
 */
public class Test14 {
	public static void main(String[] args) {
		//通过继承Thread类启动线程
		Thread t1=new MyThread_1();
		Thread t2=new MyThread_1();
		t1.start();
		t2.start();
		System.out.println("--------------这里是分割线-------------");
//	   通过实现Runnable接口启动线程
		MyThread_2 myThread_2=new MyThread_2();
		Thread t3=new Thread(myThread_2);
		Thread t4 = new Thread(myThread_2);
		t3.start();
		t4.start();
	
	}
}
//继承Thread类方式
class MyThread_1 extends Thread{
//	确保多个线程在运行时只有一个object对象作为同步锁
	public static Object object=new Object();
	public void run() {
		synchronized (object) {
			for (int i = 0; i < 100; i++) {
				showMyName();
			}
		}
	}
	public void showMyName() {
		System.out.println(Thread.currentThread().getName());
	}
}
//实现Runnable接口方式
class MyThread_2 implements Runnable{
//	只有一个该对象被传入了多个线程内，所以可以确保只有一个object作为同步锁
	private Object object=new Object();
	public void run() {
		synchronized (this.object) {
			for (int i = 0; i < 100; i++) {
				showMyName();
			}
		}
	}
	public void showMyName() {
		System.out.println(Thread.currentThread().getName());
	}
}
