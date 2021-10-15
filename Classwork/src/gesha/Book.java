package gesha;

import java.util.GregorianCalendar;

public class Book extends Item{
	String author;
	int pages;
	String publisher;
	private final int MAX_BORROW_DAY = 14;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getMAX_BORROW_DAY() {
		return MAX_BORROW_DAY;
	}

	public void dueDate(GregorianCalendar borrowDate) {
	};
}
