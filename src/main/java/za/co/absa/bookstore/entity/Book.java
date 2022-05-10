package za.co.absa.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String isbn;
    @Column
    private String title;
    @Column
    private String publisher; // possible entity here made string to save time
    @Column
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;
    @Transient //didnt get enough time to do relational mapping one to many many to many etc..
    private Author authorId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book{" +
            "id=" + id +
            ", isbn='" + isbn + '\'' +
            ", title='" + title + '\'' +
            ", publisher='" + publisher + '\'' +
            '}';
    }
}
