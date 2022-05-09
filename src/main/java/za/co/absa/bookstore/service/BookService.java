package za.co.absa.bookstore.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import za.co.absa.bookstore.entity.Book;
import za.co.absa.bookstore.repository.BookRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookService {

    private BookRepository bookRepository;

   public BookService(BookRepository bookRepository) {
       this.bookRepository = bookRepository;
   }

    private static final Logger LOGGER = LoggerFactory.getLogger(BookService.class);

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book orderBook(Long id) {
        return bookRepository.findBookById(id);
    }

    public Book orderBookByTitle(String title) {
       return bookRepository.findBookByTitle(title);
    }
}
