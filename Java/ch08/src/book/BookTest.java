package book;

class Book{
	private String author, title;
	
	public void setAuthor(String a){
		author = a;
	}
	public String getAuthor(){
		return author;
	}
	
	public void setTitle(String t){
		title = t;
	}
	
	public String getTitle(){
		return title;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book();
		
		book.setAuthor("lee");
		book.setTitle("seul");
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
	}

}
