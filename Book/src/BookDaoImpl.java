import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao{
	    //list is working as a database
	    private List<Book> book;

	    public BookDaoImpl() {
	        book = new ArrayList<>();
	        book.add(new Book(1, "Java"));
	        book.add(new Book(2, "Python"));
	        book.add(new Book(3, "Android"));
	    }

	    @Override
	    public List<Book> getAllBooks() {
	        return book;
	    }

	    @Override
	    public Book getBookByIsbn(int isbn) {
	        return book.get(isbn);
	    }

	    @Override
	    public void saveBook(Book book) {
	    	book.add(book);
	    }
	    @Override
	    public void deleteBook(Book book) {
	        book.remove(book);
	    }
	}

