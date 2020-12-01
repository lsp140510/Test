package cn.lsp.test;

/**
 * 
 * @author lsp 多线程之卖票
 */
public class Test17 {
	public static void main(String[] args) {
		// 继承Thread类方式启动线程
		Thread t1 = new SellTicketsThread();
		t1.setName("售票窗口1");
		Thread t2 = new SellTicketsThread();
		t2.setName("售票窗口2");
		Thread t3 = new SellTicketsThread();
		t3.setName("售票窗口3");
		t1.start();
		t2.start();
		t3.start();
		// 实现Runnable接口方式启动线程
		SellTicketsRunnable sellTicketsRunnable=new SellTicketsRunnable();
		Thread t4=new Thread(sellTicketsRunnable, "售票窗口4");
		Thread t5=new Thread(sellTicketsRunnable, "售票窗口5");
		Thread t6=new Thread(sellTicketsRunnable, "售票窗口6");
		t4.start();
		t5.start();
		t6.start();
	}
}

// 继承Thread类方式
class SellTicketsThread extends Thread {
	private static int ticketsNum = 100;
	private static Object Object = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (Object) {
				if (this.ticketsNum > 0) {
					System.out.println(Thread.currentThread().getName() + "卖出第" + this.ticketsNum + "张票");
					this.ticketsNum--;
					try {
//						 SellTicketsThread.sleep(10);
//						 System.out.println(SellTicketsThread.currentThread().getName());
						Thread.sleep(10);
						System.out.println(Thread.currentThread().getName());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 
			}
		}
	}
}
// 实现Runnable接口方式
class SellTicketsRunnable implements Runnable{
	private static int ticketsNum=100;
	@Override
	public void run() {
		while(true) {
			synchronized (this) {
				if (this.ticketsNum > 0) {
					System.out.println(Thread.currentThread().getName() + "卖出第" + this.ticketsNum + "张票");
					this.ticketsNum--;
					try {
//						 SellTicketsThread.sleep(10);
//						 System.out.println(SellTicketsThread.currentThread().getName());
						Thread.sleep(10);
						System.out.println(Thread.currentThread().getName());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 
			}
		}
	}
}
