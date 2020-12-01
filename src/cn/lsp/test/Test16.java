package cn.lsp.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author lsp 多线程之生产者、消费者
 */
public class Test16 {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		ConsumerThread consumerThread=new ConsumerThread(queue);
		ProducerThread producerThread=new ProducerThread(queue);
		Thread t1=new Thread(consumerThread);
		Thread t2=new Thread(producerThread);
		t1.start();
		t2.start();
	}
}
class ProducerThread implements Runnable{
	Queue<String> queue=new LinkedList<String>();
	public ProducerThread(Queue<String> queue) {
		// TODO Auto-generated constructor stub
		this.queue=queue;
	}
	@Override
	public void run() {
		while(true) {
			for(int i=1;i<=100;i++) {
				if(this.queue.size()<=100) {
					queue.add(""+i);
					System.out.println("生产者生产:"+i);
				
				}else {
					System.out.println("队列已慢");
				}
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class ConsumerThread implements Runnable{
	Queue<String> queue=new LinkedList<String>();
	public ConsumerThread(Queue<String> queue) {
		// TODO Auto-generated constructor stub
		this.queue=queue;
	}
	@Override
	public void run() {
		while(true) {
			if(!this.queue.isEmpty()) {
				System.out.println("消费者消费:"+this.queue.element());
				this.queue.remove();
			}else {
				System.out.println("队列已空");
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
