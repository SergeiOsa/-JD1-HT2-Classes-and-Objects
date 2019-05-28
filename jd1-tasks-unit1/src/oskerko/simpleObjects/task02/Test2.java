package oskerko.simpleObjects.task02;

/*2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.*/

public class Test2 {
	
	int a;
	String str;
	
	public Test2(int a, String str) {
		this.a = a;
		this.str = str;
	}
	
	public Test2(){}
	
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
}
