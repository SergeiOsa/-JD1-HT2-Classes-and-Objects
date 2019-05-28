package oskerko.simpleObjects.task03;

/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость 
(массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Student {
	
	private String fio;
	private int nGroup;
	private int[] rating; 
	
	public Student() {}
	
	public void setFio(String fio) {
		this.fio = fio;
	}
	
	public String getFio() {
		return this.fio;
	}

	public void setnGroup(int nGroup) {
		this.nGroup = nGroup;
	}
	
	public int getnGroup() {
		return nGroup;
	}

	public void setRating(int[] rating) {
		this.rating = rating;
	}

	public int[] getRating() {
		return rating;
	}

}
