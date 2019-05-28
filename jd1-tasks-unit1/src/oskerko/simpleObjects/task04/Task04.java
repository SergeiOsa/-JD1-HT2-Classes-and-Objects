package oskerko.simpleObjects.task04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import oskerko.scans.ScanInts;
import oskerko.scans.ScanStrings;

/*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, 
добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения,
причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.*/

public class Task04 {

	public static void main(String[] args) {

		String destination;
		int nTrain;
		String time;

		Train[] arrTrain = new Train[5];

		// Создание массива поездов:
		for (int i = 0; i < 5; i++) {
			destination = ScanStrings.scanStrings("пункт назначения");
			nTrain = ScanInts.scanInts("номер поезда");
			time = randomDate();

			Train tr = new Train(destination, nTrain, time);
			arrTrain[i] = tr;

		}

		printArrTrain(arrTrain);

		choice(arrTrain);

	}

	// статич метод. выбор действия
	public static void choice(Train[] arrTrain) {

		// Выбор действия:
		System.out.println("Варианты действий:");
		System.out.println("1. Отсортировать поезда по номеру поезда.");
		System.out.println("2. Вывод информации о поезде по его номеру.");
		System.out.println("3. Отсортировать поезда по пункту назначения.");
		System.out.println("4. Выход.");

		int choice;
		do {
			choice = ScanInts.scanInts("номер выбранного пункта:");
			if (choice < 1 || choice > 4) {
				System.out.println("Введите 1, 2, 3 или 4");
			}
		} while (choice < 1 || choice > 4);

		if (choice == 1) {
			sortNtrain(arrTrain);
			System.out.println("Отсортировали по номеру поезда.");
			System.out.println();
			choice(arrTrain);
		}
		if (choice == 2) {
			info(arrTrain);
			System.out.println("Вывели информации о поезде по его номеру.");
			System.out.println();
			choice(arrTrain);
		}
		if (choice == 3) {
			sortDestination(arrTrain);
			System.out.println("Отсортировали по пункту назначения.");
			System.out.println();
			choice(arrTrain);
		}
		if (choice == 4) {
			System.out.println("The End.");
		}
	}

	// статич метод вывод массива на консоль:
	public static void printArrTrain(Train[] arrTrain) {
		for (int i = 0; i < arrTrain.length; i++) {
			System.out.println("Пункт назначения: " + arrTrain[i].getDestination());
			System.out.println("Номер поезда: " + arrTrain[i].getnTrain());
			System.out.println("Время отправления: " + arrTrain[i].getTime());
			System.out.println();
		}
	}

	// статич. метод. Генерация случайной даты:
	public static String randomDate() {

		Random random = new Random();
		long nowTime = Calendar.getInstance().getTimeInMillis();
		long generateTime = random.nextInt(2147483647);
		nowTime = nowTime + generateTime;
		String randomDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(nowTime);
		return randomDate;
	}

	// статич метод. Сортировка по номеру поезда:
	public static void sortNtrain(Train[] arrTrain) {

		Train element;

		for (int j = 0; j < arrTrain.length - 1; j++) {
			for (int i = 0; i < arrTrain.length - 1; i++) {
				if (arrTrain[i].getnTrain() > arrTrain[i + 1].getnTrain()) {
					element = arrTrain[i];
					arrTrain[i] = arrTrain[i + 1];
					arrTrain[i + 1] = element;
				}
			}
		}

		printArrTrain(arrTrain);

	}

	// статич метод. Вывод информации о поезде по его номеру:
	public static void info(Train[] arrTrain) {

		int n;

		do {
			n = ScanInts.scanInts("номер поезда");
			if (n != arrTrain[0].getnTrain() && n != arrTrain[1].getnTrain() && n != arrTrain[2].getnTrain()
					&& n != arrTrain[3].getnTrain() && n != arrTrain[4].getnTrain()) {
				System.out.println("Поезда с таким номером нет");
			}
		} while (n != arrTrain[0].getnTrain() && n != arrTrain[1].getnTrain() && n != arrTrain[2].getnTrain()
				&& n != arrTrain[3].getnTrain() && n != arrTrain[4].getnTrain());

		for (int i = 0; i < arrTrain.length; i++) {
			if (n == arrTrain[i].getnTrain()) {
				System.out.println("Номер поезда: " + arrTrain[i].getnTrain());
				System.out.println("Пункт назначения: " + arrTrain[i].getDestination());
				System.out.println("Время отправления: " + arrTrain[i].getTime());
				System.out.println();
			}
		}
	}

	// статич метод. Сортировка массива по станции назначения:
	public static void sortDestination(Train[] arrTrain) {

		Train element;

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		long millisI = 0;
		Date dateI;
		long millisI1 = 0;
		Date dateI1;

		// если одинак названия сорт по времени:
		for (int k = 0; k < arrTrain.length - 1; k++) {
			for (int m = k + 1; m < arrTrain.length - 1; m++) {
				if (arrTrain[k].getDestination().equals(arrTrain[m].getDestination())) {

					for (int j = 0; j < arrTrain.length - 1; j++) {
						for (int i = 0; i < arrTrain.length - 1; i++) {
							try {
								dateI = sdf.parse(arrTrain[i].getTime());
								millisI = dateI.getTime();
								dateI1 = sdf.parse(arrTrain[i + 1].getTime());
								millisI1 = dateI1.getTime();
							} catch (ParseException e) {
								e.printStackTrace();
							}
							if (millisI > millisI1) {
								element = arrTrain[i];
								arrTrain[i] = arrTrain[i + 1];
								arrTrain[i + 1] = element;
							}
						}
					}

				}
			}
		}

		// сортировка по символам:

		/*
		 * String[] arrString = new String[arrTrain.length]; for (int i = 0; i <
		 * arrTrain.length; i++) { arrString[i] = arrTrain[i].getDestination(); }
		 * Arrays.sort(arrString, String.CASE_INSENSITIVE_ORDER);
		 * 
		 * Train a; for (int i = 0; i < arrString.length - 1; i++) { for (int j = 0; j <
		 * arrString.length - 1; j++) { if(arrString[i].equals(arrTrain[i +
		 * 1].getDestination())) { a = arrTrain[i]; arrTrain[i] = arrTrain[i + 1];
		 * arrTrain[i + 1] = a; } } }
		 */

		
		// вроде есть ошибка????
		int len = 0;
		for (int j = 0; j < arrTrain.length - 1; j++) {
			for (int i = 0; i < arrTrain.length - 1; i++) {

				if (arrTrain[i].getDestination().length() < arrTrain[i + 1].getDestination().length()) {
					len = arrTrain[i].getDestination().length();
				} else {
					len = arrTrain[i + 1].getDestination().length();
				}
				for (int k = 0; k < len; k++) {

					if (arrTrain[i].getDestination().charAt(k) > arrTrain[i + 1].getDestination().charAt(k)) {
						element = arrTrain[i];
						arrTrain[i] = arrTrain[i + 1];
						arrTrain[i + 1] = element;
					}
				}
			}
		}

		printArrTrain(arrTrain);

	}

}
