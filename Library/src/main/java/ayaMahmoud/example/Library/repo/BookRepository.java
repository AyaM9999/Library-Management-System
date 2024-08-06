package ayaMahmoud.example.Library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ayaMahmoud.example.Library.models.entity.Book;



@Repository
public interface BookRepository extends JpaRepository<Book,Long>  {


}
