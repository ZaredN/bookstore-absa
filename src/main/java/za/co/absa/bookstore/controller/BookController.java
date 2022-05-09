package za.co.absa.bookstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.absa.bookstore.entity.Book;
import za.co.absa.bookstore.service.BookService;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //TODO: get a single book
    @GetMapping("/books/{id}")
    public void getBook(@PathVariable long id){
            bookService.orderBook(id);

    }
    //TODO: get all books
    @GetMapping("/bookList")
    public void getAllBooks(RequestBody Book) {
        bookService.getAll();
    }

    //TODO: delete a book
    public void deleteBook() {

    }

    //TODO: delete all Books
    public void deleteAllBooks() {

    }

    //TODO: save a book
    public void saveBook(){

    }

    //TODO: save all books
    public void saveAllBooks(){

    }

    @PostMapping("/order/{title}")
    public Book orderABook(@PathVariable String title){
      return bookService.orderBookByTitle(title);

    }
}
