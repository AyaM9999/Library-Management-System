package ayaMahmoud.example.Library.repo;

import ayaMahmoud.example.Library.models.entity.Borrowings;
import ayaMahmoud.example.Library.models.entity.Book;
import ayaMahmoud.example.Library.models.entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BorrowingsRepository extends JpaRepository<Borrowings, Long> {
    Optional<Borrowings> findBorrowingsByPatronAndBook(Patron patron, Book book);

}
