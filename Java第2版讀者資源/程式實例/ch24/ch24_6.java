import java.util.*;
class Book {
	int id;					// 圖書編號
	String bookTitle;		// 書籍名稱
	String author;			// 作者
	public Book(int id, String bookTitle, String author) {
		this.id = id;
		this.bookTitle = bookTitle;
		this.author = author;
	}
}	
public class ch24_6 {
    public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>(); 
		Book b1 = new Book(1001, "Java王者歸來", "洪錦魁");
		Book b2 = new Book(1002, "Python王者歸來", "洪錦魁");
		Book b3 = new Book(1003, "HTML5+CSS3王者歸來", "洪錦魁");
		list.add(b1);
		list.add(b2);
		list.add(b3);
// 遍歷ArrayList使用foreach
		for(Book obj:list)
			System.out.println(obj.id + " " + obj.bookTitle + " " + obj.author);
	}
}

