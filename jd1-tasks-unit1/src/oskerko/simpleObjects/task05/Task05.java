package oskerko.simpleObjects.task05;

/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию
и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/

public class Task05 {

	public static void main(String[] args) {
		
		Count count = new Count();
		count.getInfo();
		count.dec();
		count.inc();
		count.inc();
		count.getInfo();
		count.dec();
		count.getInfo();
		
		Count count2 = new Count (54, 50, 60);
		count2.getInfo();
		for (int i = 0; i < 6; i++) {
			count2.inc();
		}
		count2.getInfo();
		count2.inc();
		count2.getInfo();
		
	}

}
