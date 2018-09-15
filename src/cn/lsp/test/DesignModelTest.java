package cn.lsp.test;
/**
 * 
 * @author lsp
 *@version 1.1
 *静态代理模式
 */
public class DesignModelTest {
	public static void main(String[] args) {
		new Proxy(new Produce()).sell();
	}
}
//代理类被代理类都要实现这个接口
interface Sell {
	void sell();
}
//被代理类
class Produce implements Sell {
	@Override
	public void sell() {
		System.out.println("生产者销售产品");
	}
}
//代理类
class Proxy implements Sell{
	private Produce produce;
	public Proxy(Produce produce) {
		// TODO Auto-generated constructor stub
		this.produce=produce;
	}
	@Override
//	对被代理的一些操作可以写在这里，不用修改被代理类
	public void sell() {
		System.out.println("before 被代理类");
		produce.sell();
		System.out.println("after 被代理类");
	}
}