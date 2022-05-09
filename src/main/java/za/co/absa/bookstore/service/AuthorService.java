package za.co.absa.bookstore.service;

import org.springframework.stereotype.Service;
import za.co.absa.bookstore.entity.Author;
import za.co.absa.bookstore.repository.AuthorRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class AuthorService {

    public final AuthorRepository authorRepository;


    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author findAuthorByName(String firstName, String lastName) {
        return authorRepository.findAuthorByFirstNameAndLastName(firstName, lastName);
    }

    public Author saveNewAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author updateAuthor(Author author) {
        Author retrieveAuthor = authorRepository.getById(author.getId());
        retrieveAuthor.setFirstName(author.getFirstName());
        retrieveAuthor.setLastName(author.getLastName());
        return authorRepository.save(retrieveAuthor);
    }

    public void deleteAuthorById(Long id) {
        authorRepository.deleteById(id);
    }
}
