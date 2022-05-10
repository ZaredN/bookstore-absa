//package za.co.absa.bookstore;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.test.context.ActiveProfiles;
//import za.co.absa.bookstore.repository.BookRepository;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@ActiveProfiles("Default")
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class MySQLIntegrationTest {
//
//    @Autowired
//    BookRepository bookRepository;
//
//    /**no books stored should pass if no books stored otherwise change to number of
//     * books I have added in the database to ensure
//     */
//    @Test
//    void testDB(){
//        long countBefore = bookRepository.count();
//        assertThat(countBefore).isEqualTo(0);
//    }
//}
