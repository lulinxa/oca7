package building;
import library.Book;
class StoryBook extends Book {
	StoryBook(){
		Book book = new Book();
		// this doesn't compile
		// can't access protected variables 
		// using Book reference variable!!!
		/*
		String v = book.author;
		book.modifyTemplate();
		*/
		author="ABC";
		modifyTemplate();
	}
}
