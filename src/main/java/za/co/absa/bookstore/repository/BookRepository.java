package za.co.absa.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.absa.bookstore.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Override
    List<Book> findAll();

    @Override
    Book getById(Long id);

    List<Book> getAllBookByIsbn(String isbn);

    Book findBookById(Long id);

    Book findBookByTitle(String title);

}
