package oskerko.simpleObjects.task06;

import oskerko.scans.ScanInts;

/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class Task06 {

	public static void main(String[] args) {

		int hh;
		int mm;
		int ss;
		
		int changeHH;
		int changeMM;
		int changeSS;

		hh = ScanInts.scanInts("часы:");
		mm = ScanInts.scanInts("минуты:");
		ss = ScanInts.scanInts("секунды:");

		Time time = new Time(hh, mm, ss);
		System.out.printf("%02d:%02d:%02d", time.getHh(), time.getMm(), time.getSs());
		System.out.println();

		changeHH = ScanInts.scanInts("изменение (часы):");
		changeMM = ScanInts.scanInts("изменение (минуты):");
		changeSS = ScanInts.scanInts("изменение (секунды):");
		
		time.changeSs(changeSS);
		time.changeMm(changeMM);
		time.changeHh(changeHH);
		
		System.out.printf("%02d:%02d:%02d", time.getHh(), time.getMm(), time.getSs());
		System.out.println();
	}

}
