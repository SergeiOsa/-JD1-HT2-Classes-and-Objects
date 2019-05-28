package oskerko.simpleObjects.task01;

/*1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
Добавьте метод, который находит сумму значений этих переменных, и метод, 
который находит наибольшее значение из этих двух переменных.*/

public class Test1 {
	
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void printAB() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	
	public int sum() {
		int sum;
		sum = a + b;
		
		return sum;
	}
	
	public void compare() {
		if(a > b) {
			System.out.println("a > b");
		} 
		if (b > a) {
			System.out.println("b > a");
		}
		if (a == b) {
			System.out.println("a = b");
		}
	}
	
}
