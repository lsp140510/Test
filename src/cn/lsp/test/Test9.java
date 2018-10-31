package cn.lsp.test;

/*
 * 单例模式
 */
public class Test9 {

}

class Singleton1 {
	private static Singleton1 singleton1 = null;

	private Singleton1() {

	}

	public static Singleton1 getInstance() {
		if (singleton1 == null) {
			singleton1 = new Singleton1();
		}
		return singleton1;
	}
}

class Singleton2 {
	private static Singleton2 singleton2 = null;

	private Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (singleton2 == null) {
			synchronized (Singleton2.class) {
				if (singleton2 == null) {
					singleton2 = new Singleton2();
				}
			}
		}
		return singleton2;
	}
}

class Singleton3 {
	private static Singleton3 singleton3 = new Singleton3();

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return singleton3;
	}
}
