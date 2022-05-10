package za.co.absa.bookstore.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.absa.bookstore.entity.Book;
import za.co.absa.bookstore.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping(value = "/all")
    List<Book> getAllBooks() {
        return bookService.getAll();

    }

    @PostMapping("/create")
    public void saveBook(@RequestBody Book book){
        bookService.save(book);

    }

}
