package oskerko.simpleObjects.task10.airlineLogic;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import oskerko.simpleObjects.task10.airline.AirlineList;

/*
10. Создать класс Airline, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

public class AirlineLogic {

	public void printAirlineList(AirlineList airlineList) {

		for (int i = 0; i < airlineList.getSize(); i++) {
			System.out.println(airlineList.getAirline(i));
		}
	}

	public AirlineList compareDestination(AirlineList airlineList, String destination) {
		AirlineList compareList = new AirlineList();
		for (int j = 0; j < airlineList.getSize(); j++) {
			if (airlineList.getAirline(j).getDestination().equals(destination)) {
				compareList.add(airlineList.getAirline(j));
			}
		}
		return compareList;
	}

	public AirlineList compareDayOfWeek(AirlineList airlineList, DayOfWeek dayOfWeek) {
		AirlineList compareList = new AirlineList();
		for (int j = 0; j < airlineList.getSize(); j++) {
			if (airlineList.getAirline(j).getDayOfWeek().equals(dayOfWeek)) {
				compareList.add(airlineList.getAirline(j));
			}
		}
		return compareList;
	}

	public AirlineList compareIsAfter(AirlineList compareList, int hour, int minute) {
		AirlineList compareList2 = new AirlineList();
		LocalDateTime time2 = compareList.getAirline(0).getTime();
		time2 = time2.withHour(hour);
		time2 = time2.withMinute(minute);

		System.out.println("Список рейсов на данный день недели позже этого времени " + time2);

		for (int i = 0; i < compareList.getSize(); i++) {
			if (compareList.getAirline(i).getTime().isAfter(time2)) {
				compareList2.add(compareList.getAirline(i));
			}
		}
		return compareList2;
	}

}
