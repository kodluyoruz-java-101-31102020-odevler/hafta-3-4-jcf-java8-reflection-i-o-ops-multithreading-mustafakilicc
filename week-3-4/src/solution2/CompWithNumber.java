package solution2;

import java.util.Comparator;

public class CompWithNumber implements Comparator<Book>{

	
	@Override
	public int compare(Book book1,Book book2) {
		
		int num1=book1.getNumberPages();
		int num2=book2.getNumberPages();
		
		if(num2 > num1) 
			return -1;
		
		else if(num1 > num2) 
			return 1;
		
		else 
		    return 0;
	}
	

}
