package oskerko.simpleObjects.task06;

/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class Time {

	private int hh;
	private int mm;
	private int ss;

	public Time() {
		this(0, 0, 0);
	}

	// конструктор:
	public Time(int hh, int mm, int ss) {
		if (hh < 0 || hh > 24) {
			this.hh = 0;
		} else {
			this.hh = hh;
		}
		
		if (mm < 0 || mm > 59) {
			this.mm = 0;
		} else {
			this.mm = mm;
		}
		
		if (ss < 0 || ss > 59) {
			this.ss = 0;
		} else {
			this.ss = ss;
		}
		
	}
	
	// изм сек:
	public void changeSs(int ss) {
		int mm;
		int hh;
		
		mm = this.mm + (this.ss +ss)/60;
		this.mm = mm % 60;
		
		hh = this.hh + mm / 60;
		this.hh = hh % 24;
		
		this.ss = (this.ss + ss) % 60;
	}
	
	// изм мин:
	public void changeMm(int mm) {
		int hh;
		hh = this.hh + (this.mm + mm) / 60;
		this.hh = hh % 24;
		this.mm = (this.mm + mm) % 60;	
	}
	
	// имз часов:
	public void changeHh(int hh) {
		this.hh = (this.hh + hh) % 24;	
	}
	
	
	public int getHh() {
		return hh;
	}

	public void setHh(int hh) {
		if (hh < 0 || hh > 24) {
			this.hh = 0;
		} else {
			this.hh = hh;
		}
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		if (mm < 0 || mm > 59) {
			this.mm = 0;
		} else {
			this.mm = mm;
		}
	}

	public int getSs() {
		return ss;
	}

	public void setSs(int ss) {
		if (ss < 0 || ss > 59) {
			this.ss = 0;
		} else {
			this.ss = ss;
		}
	}
	
}
