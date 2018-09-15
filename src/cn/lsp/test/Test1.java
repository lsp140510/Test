package cn.lsp.test;
/**
 * 
 * @author lsp
 * ==是比较两个对象的地址是否一样，equals方法是判断对象内容是否一样，需要重写
 *验证equals
 *重写之后和之前的区别
 *object里的equals是用==来判断，自己写得类里是重写了equals方法，判断对象的内容是不是相同
 */
public class Test1 {
	public static void main(String[] args) {
		Object object1=new Object();
		Object object2=new Object();
		System.out.println(object1==object2);
		System.out.println(object1.equals(object2));
		Person person1=new Person("a", 11, 'm');
		System.out.println(person1.hashCode());;
		Person person2=new Person("b", 11, 'm');
		System.out.println(person1==person2);
		System.out.println(person1.equals(person2));
	}
}

class Person {
	private String name;
	private int age;
	private char sex;

	public Person(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		return this.name == person.name && this.age == person.age && this.sex == person.sex;
	}
}