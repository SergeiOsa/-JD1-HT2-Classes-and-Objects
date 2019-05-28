package oskerko.simpleObjects.task09.book;

import java.util.ArrayList;
import java.util.List;

public class BookList {

	private List<Book> bookList;

	public BookList() {
		this.bookList = new ArrayList<Book>();
	}

	public BookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public void add(Book book) {
		bookList.add(book);
	}

	public void remove(int index) {
		bookList.remove(index);
	}

	public int getSize() {
		return bookList.size();
	}
	
	public Book getElementBook(int index) {
		return bookList.get(index);
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookList == null) ? 0 : bookList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookList other = (BookList) obj;
		if (bookList == null) {
			if (other.bookList != null)
				return false;
		} else if (!bookList.equals(other.bookList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookList [bookList=" + bookList + "]";
	}
	
}