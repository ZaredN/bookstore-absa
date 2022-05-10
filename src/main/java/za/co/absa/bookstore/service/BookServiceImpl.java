package za.co.absa.bookstore.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.absa.bookstore.entity.Book;
import za.co.absa.bookstore.entity.Difficulty;
import za.co.absa.bookstore.repository.BookRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService{
    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);
    @Autowired
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }




    @Override
    public List<Book> getAll() {
        LOGGER.info("getting all books");
    return bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        LOGGER.info("saving..books..");
        bookRepository.save(book);

    }
}
