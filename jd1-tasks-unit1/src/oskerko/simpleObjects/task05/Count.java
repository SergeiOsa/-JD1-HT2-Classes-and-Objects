package oskerko.simpleObjects.task05;

/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию
и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/

public class Count {

	private int count;
	private int min;
	private int max;

	public Count() {
		this(0, 0, 100);
	}

	public Count(int count, int min, int max) {
		this.count = count;
		this.min = min;
		this.max = max;
	}

	public void inc() {
		if (this.count < max) {
			this.count = this.count + 1;
		} else {
			System.out.println("Превышено допустимое значение");
			System.out.println();
		}
	}

	public void dec() {
		if (this.count > min) {
			this.count = this.count - 1;
		} else {
			System.out.println("Превышено допустимое значение");
			System.out.println();
		}
	}

	public void getInfo() {
		System.out.println("count=" + count);
		System.out.println("min=" + min);
		System.out.println("max=" + max);
		System.out.println();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
