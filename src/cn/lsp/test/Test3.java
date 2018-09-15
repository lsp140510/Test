package cn.lsp.test;

/**
 * 
 * @author lsp 测试toString()方法的输出
 * @前面代表对象的类型   [代表数组
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println(new Byte((byte) 1).toString());
		System.out.println(new Short((short) 1).toString());
		System.out.println(new Character('a').toString());
		System.out.println(new Integer(1).toString());
		System.out.println(new Long(1).toString());
		System.out.println(new Boolean(true).toString());
		System.out.println(new Float(1).toString());
		System.out.println(new Double(1).toString());

		System.out.println(new String("a").toString());
		System.out.println(new byte[3].toString());
		System.out.println(new short[3].toString());
		System.out.println(new int[3].toString());
		System.out.println(new char[3].toString());
		System.out.println(new boolean[3].toString());
		System.out.println(new long[3].toString());
		System.out.println(new float[3].toString());
		System.out.println(new String[3].toString());
		
		System.out.println(new byte[3][3].toString());
	}
}
