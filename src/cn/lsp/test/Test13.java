package cn.lsp.test;

/**
 * 
 * @author lsp 抽象类、接口测试
 */
public class Test13 {
	public static void main(String[] args) {
		Son son = new Son();
		son.showCode();
		Sub sub = new Sub();
		sub.showA();
	}
}

abstract class Father {
	public int a = 1;

	// 抽象类可以没有抽象方法
	abstract public void showCode();
}

class Son extends Father {
	// @Override
	public void showCode() {
		// TODO Auto-generated method stub
		System.out.println("子类覆写抽象父类的抽象方法");
	}
}

interface Super {
	int superA = 1;

	void showA();
}

class Sub implements Super {
	@Override
	public void showA() {
		// TODO Auto-generated method stub
		System.out.println(superA);
	}
}
