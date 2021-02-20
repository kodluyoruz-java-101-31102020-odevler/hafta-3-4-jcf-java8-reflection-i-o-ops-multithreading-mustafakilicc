package solution2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		
		Set<Book> books = new HashSet<Book>();
		
		books.add(new Book("sapiens",443,"Noal Harari",2011));
		books.add(new Book("insanlýk 2.0",652,"Ray Kurzweil",2005));
		books.add(new Book("50 Soruda Yapay Zeka",185,"Cem Say",2018));
		books.add(new Book("insanýn Psikolojisi",370,"Robert Cialdini",1984));
		books.add(new Book("21. yy. Ýçin 21 Ders",330,"Noal Harari",2018));

		
		Set<Book> allBooks = new TreeSet<Book>(books);
		
		
		 
        System.out.println("CompareTo metodu ile sýralanýr\n");
        for(Book book : allBooks) {
            System.out.println(book.getBookName());
        }
        
        
        CompWithNumber compWithNumber = new CompWithNumber();
        Set<Book> sortedBooksByNumberPage = new TreeSet<Book>(compWithNumber);
        sortedBooksByNumberPage.addAll(books);
		
		System.out.println("Comparetor sýnýfýna göre sýralanýr");
		for(Book sortedBook : sortedBooksByNumberPage) {
            System.out.println(sortedBook.getBookName());
        }
	}

}
