package oskerko.simpleObjects.task10;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Random;
import oskerko.scans.ScanChars;
import oskerko.scans.ScanInts;
import oskerko.scans.ScanStrings;
import oskerko.simpleObjects.task10.airline.Airline;
import oskerko.simpleObjects.task10.airline.AirlineList;
import oskerko.simpleObjects.task10.airlineLogic.AirlineLogic;

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

public class Task10 {

	static AirlineList airlineList = new AirlineList();
	static AirlineLogic all = new AirlineLogic();

	public static void main(String[] args) {

		all.printAirlineList(createList());
		choice();

		System.out.println("THE END");

	}

	public static AirlineList createList() {
		String destination;
		int flightNum;
		String airplaneType;
		LocalDateTime time;
		DayOfWeek dayOfWeek;
		int month;
		int dayOfMonth;
		int hour;
		int minute;

		Random r = new Random();
		Airline airline;

		System.out.println("Хотите добавить рейс? (y - добавить; n - не добавлять)");
		char ch;
		ch = ScanChars.scanChars("свой выбор:");
		while (ch == 'y') {
			destination = ScanStrings.scanStrings("пункт назначения");
			flightNum = r.nextInt(100);
			airplaneType = "надёжный алюминевый самолёт";
			month = ScanInts.scanInts("месяц");
			dayOfMonth = ScanInts.scanInts("день");
			hour = ScanInts.scanInts("час");
			minute = ScanInts.scanInts("минуты");
			time = LocalDateTime.of(2019, month, dayOfMonth, hour, minute);
			dayOfWeek = time.getDayOfWeek();
			
			airline = new Airline(destination, flightNum, airplaneType, time, dayOfWeek);
			airlineList.add(airline);
			System.out.println("Рейс добавлен.");
			System.out.println("Хотите добавить рейс? y - добавить; n - не добавлять");
			ch = ScanChars.scanChars("свой выбор:");
		}

		return airlineList;

	}

	public static void choice() {
		int choice;

		do {
			do {
				System.out.println("Какое дествие выполнить, хозяин?");
				System.out.println("1) список рейсов для заданного пункта назначения;");
				System.out.println("2) список рейсов для заданного дня недели;");
				System.out.println(
						"3) список рейсов для заданного дня недели, время вылета для которых больше заданного;");
				System.out.println("4) закрыть приложение и сходить за пивом.");
				
				choice = ScanInts.scanInts("свой выбор:");
				if (choice < 1 || choice > 4) {
					System.out.println("Введите 1, 2, 3 или 4");
				}
			} while (choice < 1 || choice > 4);

			if (choice == 1) {
				String destination = ScanStrings.scanStrings("пункт назначения для сортировки:");
				AirlineList compareList = all.compareDestination(airlineList, destination);
				all.printAirlineList(compareList);
			}

			if (choice == 2) {
				DayOfWeek dayOfWeek = null;
				int n;
				
				do {
					n = ScanInts.scanInts("номер дня недели");
					if (n == 1) {
						dayOfWeek = dayOfWeek.MONDAY;
					}
					if (n == 2) {
						dayOfWeek = dayOfWeek.TUESDAY;
					}
					if (n == 3) {
						dayOfWeek = dayOfWeek.WEDNESDAY;
					}
					if (n == 4) {
						dayOfWeek = dayOfWeek.THURSDAY;
					}
					if (n == 5) {
						dayOfWeek = dayOfWeek.FRIDAY;
					}
					if (n == 6) {
						dayOfWeek = dayOfWeek.SATURDAY;
					}
					if (n == 7) {
						dayOfWeek = dayOfWeek.SUNDAY;
					}
				} while (n < 1 || n > 7);
				
				AirlineList compareList = all.compareDayOfWeek(airlineList, dayOfWeek);
				all.printAirlineList(compareList);
			}
			
			if (choice == 3) {
				DayOfWeek dayOfWeek = null;
				int n;
				
				do {
					n = ScanInts.scanInts("номер дня недели");
					if (n == 1) {
						dayOfWeek = dayOfWeek.MONDAY;
					}
					if (n == 2) {
						dayOfWeek = dayOfWeek.TUESDAY;
					}
					if (n == 3) {
						dayOfWeek = dayOfWeek.WEDNESDAY;
					}
					if (n == 4) {
						dayOfWeek = dayOfWeek.THURSDAY;
					}
					if (n == 5) {
						dayOfWeek = dayOfWeek.FRIDAY;
					}
					if (n == 6) {
						dayOfWeek = dayOfWeek.SATURDAY;
					}
					if (n == 7) {
						dayOfWeek = dayOfWeek.SUNDAY;
					}
				} while (n < 1 || n > 7);
				
				int hour = ScanInts.scanInts("часы для сравнения:");
				int minute = ScanInts.scanInts("минуты для сравнения:");
				
				AirlineList compareList = all.compareDayOfWeek(airlineList, dayOfWeek);
				AirlineList compareList2 = all.compareIsAfter(compareList, hour, minute);
				all.printAirlineList(compareList2);
			}

		} while (choice != 4);
	}

}
