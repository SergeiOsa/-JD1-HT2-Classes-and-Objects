package oskerko.simpleObjects.task09;

import java.util.Random;
import oskerko.scans.ScanInts;
import oskerko.scans.ScanStrings;
import oskerko.simpleObjects.task09.book.Book;
import oskerko.simpleObjects.task09.book.BookList;
import oskerko.simpleObjects.task09.bookLogic.BookLogic;
import oskerko.simpleObjects.task09.bookLogic.PrintBookList;

/*9. Создать класс Book, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * 
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.*/

public class Task09 {

	public static void main(String[] args) {

		int n; // number of book
		int choice;
		int id;
		String title;
		String author;
		String publishingHouse;
		int year;
		int numOfPages;
		int price;
		String cover;

		n = ScanInts.scanInts("количество книг:");

		Book book;
		BookList bookList = new BookList();
		PrintBookList pbl = new PrintBookList();
		BookLogic bookLogic = new BookLogic();

		Random r = new Random();

		for (int i = 0; i < n; i++) {
			id = i + 1;
			title = ScanStrings.scanStrings("название книги:");
			author = ScanStrings.scanStrings("имя автора:");
			publishingHouse = ScanStrings.scanStrings("название издательства:");
			year = r.nextInt(120) + 1900;
			numOfPages = r.nextInt(999) + 1;
			price = r.nextInt(990) + 10;
			cover = "великолепный переплёт";
			book = new Book(id, title, author, publishingHouse, year, numOfPages, price, cover);
			bookList.add(book);
		}

		pbl.printBookList(bookList);
		System.out.println();

		do {
			System.out.println("Найти и вывести:");
			System.out.println("1) список книг заданного автора;");
			System.out.println("2) список книг, выпущенных заданным издательством;");
			System.out.println("3) список книг, выпущенных после заданного года;");
			System.out.println("4) выход из программы.");

			do {
				choice = ScanInts.scanInts("выбранное действие:");
				if (choice < 1 || choice > 4) {
					System.out.println("Введите 1, 2, 3 или 4");
				}
			} while (choice < 1 || choice > 4);

			if (choice == 1) {
				String author2 = ScanStrings.scanStrings("имя автора для сортировки:");
				BookList compareAuthor = bookLogic.compareAuthor(bookList, author2);
				pbl.printBookList(compareAuthor);
			}

			if (choice == 2) {
				String publishingHouse2 = ScanStrings.scanStrings("название издательства для сортировки:");
				BookList comparePublishingHouse = bookLogic.comparePublishingHouse(bookList, publishingHouse2);
				pbl.printBookList(comparePublishingHouse);
			}

			if (choice == 3) {
				int year2 = ScanInts.scanInts("год для сортировки:");
				BookList compareYear = bookLogic.compareYear(bookList, year2);
				pbl.printBookList(compareYear);
			}

		} while (choice != 4);

		System.out.println("ну вот и всё. это конец");

	}

}
