package za.co.absa.bookstore.service;

import za.co.absa.bookstore.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getAll();
    void save(Book book);

}
