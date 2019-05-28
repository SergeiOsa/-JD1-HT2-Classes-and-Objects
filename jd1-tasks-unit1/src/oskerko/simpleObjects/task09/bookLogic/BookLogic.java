package oskerko.simpleObjects.task09.bookLogic;

import java.util.Comparator;
import oskerko.simpleObjects.task09.book.Book;
import oskerko.simpleObjects.task09.book.BookList;

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

public class BookLogic implements Comparator<Book> {
		
	@Override
	public int compare(Book book1, Book book2) {
		return book1.getAuthor().compareTo(book2.getAuthor());
	}

	public BookList compareAuthor(BookList bookList, String author) {	
		BookList compareList = new BookList();
		for (int i = 0; i < bookList.getSize(); i++) {
			if (bookList.getElementBook(i).getAuthor().equals(author)) {
				compareList.add(bookList.getElementBook(i));
			}
		}
		return compareList;
	}
	
	public BookList comparePublishingHouse(BookList bookList, String publishingHouse) {
		BookList compareList = new BookList();
		for (int i = 0; i < bookList.getSize(); i++) {
			if (bookList.getElementBook(i).getPublishingHouse().equals(publishingHouse)) {
				compareList.add(bookList.getElementBook(i));
			}
		}
		return compareList;
	}
	
	public BookList compareYear(BookList bookList, int year) {
		BookList compareList = new BookList();
		for (int i = 0; i < bookList.getSize(); i++) {
			if (bookList.getElementBook(i).getYear() >= year) {
				compareList.add(bookList.getElementBook(i));
			}
		}
		return compareList;
	}
	
}
