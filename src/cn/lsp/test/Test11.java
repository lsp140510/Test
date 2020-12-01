package cn.lsp.test;
 /**
  * 
  * @author lsp
  *
  */
/*
 * 测试多态，判断多态调用方法
 * 多态的条件：1、有继承   2、有方法的重写   3、父类引用指向子类对象
 */
public class Test11 {
	public static void main(String[] args) {
		SuperClass aClass = new SubClass();
		SuperClass bSuper=new SuperClass();
		aClass.testFunction();
		aClass.testA();
		// aClass.testB();testB()只在子类中出现，父类的引用不会调用到父类中没有的函数
		// 测试转型，将指向子类对象的父类引用转型为子类引用，这样就可以使用子类特有的方法
		SubClass subClass = (SubClass) aClass;
		subClass.testC();
//		判断对象类型，只能应用于引用类型的判断
		System.out.println(aClass instanceof SubClass);//true
		System.out.println(bSuper instanceof SubClass);//false
	}
}

class SuperClass { 
	public String superStringA = "我是父类的成员变量";

	public void testFunction() {
		System.out.println("我是父类的成员函数");
	}

	public void testA() {
		System.out.println("我是只在父类中出现的成员函数");
	}
}

class SubClass extends SuperClass {
	@Override
	public void testFunction() {
		System.out.println("我是子类的成员函数");
		System.out.println(superStringA);
	}

	public void testB() {
		System.out.println("我是只在子类中出现的成员函数");
	}

	public void testC() {
		System.out.println(this.superStringA);
	}
}