package oskerko.simpleObjects.task03;

import java.util.Random;
import java.util.Scanner;

import oskerko.scans.ScanInts;

/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость 
(массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Task03 {

	public static void main(String[] args) {

		Student[] mas = new Student[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < mas.length; i++) {
			Student st = new Student();
			System.out.println("Введите ФИО:");
			st.setFio(sc.nextLine());
			st.setnGroup(ScanInts.scanInts("номер группы"));
			st.setRating(rating());
			mas[i] = st;
		}

		int count = 0;
		int countPrint = 0;
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < 5; j++) {
				if (mas[i].getRating()[j] > 8) {
					count++;
				}
			}
			if (count > 4) {
				System.out.println(mas[i].getFio());
				System.out.println(mas[i].getnGroup());
				for (int k = 0; k < 5; k++) {
					System.out.print(mas[i].getRating()[k] + ", ");
				}
				System.out.println();
				System.out.println();				
				countPrint++;
			}
			count = 0;
		}
		
		if(countPrint == 0) {
			System.out.println("Умных нет");
		}

	}

	public static int[] rating() {
		int[] rating = new int[5];
		Random r = new Random();

		for (int i = 0; i < rating.length; i++) {
			rating[i] = r.nextInt(3) + 8;
		}

		return rating;
	}

}
