package solution2;

public class Book implements Comparable<Book> {

	private String bookName;
	private int numberPages;
	private String authorName;
	private int releasaDate;
	
	

	public Book(String bookName, int numberPages, String authorName, int releasaDate) {
		
		this.bookName = bookName;
		this.numberPages = numberPages;
		this.authorName = authorName;
		this.releasaDate = releasaDate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getReleasaDate() {
		return releasaDate;
	}

	public void setReleasaDate(int releasaDate) {
		this.releasaDate = releasaDate;
	}

	@Override
	public int compareTo(Book book) {
		// TODO Auto-generated method stub
		
		return this.getBookName().compareTo(book.getBookName());
	}

}
