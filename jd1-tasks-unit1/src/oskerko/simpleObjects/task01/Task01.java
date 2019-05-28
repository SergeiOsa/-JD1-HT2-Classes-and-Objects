package oskerko.simpleObjects.task01;

import oskerko.scans.ScanInts;

/*1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
Добавьте метод, который находит сумму значений этих переменных, и метод, 
который находит наибольшее значение из этих двух переменных.*/

public class Task01 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int sum;
		
		a = ScanInts.scanInts("a");		
		b = ScanInts.scanInts("b");
		
		Test1 t1 = new Test1();
		
		t1.setA(a);
		t1.setB(b);
		
		t1.printAB();
		
		sum = t1.sum();
		System.out.println("sum=" + sum);
		
		t1.compare();
	}

}
