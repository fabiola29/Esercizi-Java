
public class start {

    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        for (Book book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

        //update student
        Book book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
    }
}
