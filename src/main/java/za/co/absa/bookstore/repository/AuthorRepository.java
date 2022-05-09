package za.co.absa.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.absa.bookstore.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Author findAuthorByFirstNameAndLastName(String name, String lastName);
}
