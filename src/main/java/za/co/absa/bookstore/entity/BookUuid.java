//package za.co.absa.bookstore.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import java.util.UUID;
//@Entity
//@Getter
//@Setter
//public class BookUuid {
//    @Id
//    @GeneratedValue(generator = "uuid1")
//    @GenericGenerator(name = "uuid1", strategy = "uuid1")
//    @Column(columnDefinition = "VARBINARY(16", updatable = false, nullable = false)
//    private UUID id;
//
//    private String title;
//    private String isbn;
//    private String publisher;
//
//}
