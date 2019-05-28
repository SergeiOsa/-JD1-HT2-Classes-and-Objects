package oskerko.simpleObjects.task02;

/*2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.*/

public class Task02 {

	public static void main(String[] args) {
		
		Test2 t2 = new Test2(9, "asdqa");
		
		System.out.println(t2.a);
		System.out.println(t2.str);
		
		
		Test2 t22 = new Test2();
		
		System.out.println(t22.a);
		System.out.println(t22.str);
		
	}

}
