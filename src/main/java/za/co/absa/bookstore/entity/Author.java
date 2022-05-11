package za.co.absa.bookstore.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(
        name = "BookAuthor",
        joinColumns = {
            @JoinColumn(name = "bookId", referencedColumnName = "Id")
        },inverseJoinColumns = {@JoinColumn(name = "authorId",
          referencedColumnName = "Id")}
    )
    @MapKey(name = "title")
    private Map<String, BookGroup> books = new HashMap<String, BookGroup>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return id == author.id;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
