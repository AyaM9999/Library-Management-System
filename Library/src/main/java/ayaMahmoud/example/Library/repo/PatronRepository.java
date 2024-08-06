package ayaMahmoud.example.Library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ayaMahmoud.example.Library.models.entity.Patron;



@Repository
public interface PatronRepository extends JpaRepository<Patron,Long>  {

}
