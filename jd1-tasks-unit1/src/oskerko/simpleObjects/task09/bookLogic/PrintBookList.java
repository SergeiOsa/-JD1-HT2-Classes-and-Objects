package oskerko.simpleObjects.task09.bookLogic;

import oskerko.simpleObjects.task09.book.BookList;

public class PrintBookList {
	
	
	public void printBookList(BookList bookList) {
		int size = bookList.getSize();
		for (int i = 0; i < size; i++) {
			System.out.println(bookList.getElementBook(i));
		}
		System.out.println();
	}
	
}
