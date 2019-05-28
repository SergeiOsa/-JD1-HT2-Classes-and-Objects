package oskerko.simpleObjects.task04;

/*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, 
добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения,
причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.*/

public class Train {
	
	private String destination;
	private int nTrain;
	private String time;
	
	public Train() {}
	
	public Train(String destination, int nTrain, String time) {
		this.destination = destination;
		this.nTrain = nTrain;
		this.time = time;
	}
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getnTrain() {
		return nTrain;
	}
	public void setnTrain(int nTrain) {
		this.nTrain = nTrain;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
