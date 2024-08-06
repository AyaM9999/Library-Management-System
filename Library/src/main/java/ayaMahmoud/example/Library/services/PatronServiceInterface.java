package ayaMahmoud.example.Library.services;
import java.util.List;
import ayaMahmoud.example.Library.models.entity.Patron;

public interface PatronServiceInterface {

    Patron add(Patron patron);

    Patron update(Patron patron);

    Patron save(Patron patron);

    Patron findPatronById(Long id_Patron);

    List<Patron> findAllPatron();

    void deleteById(Long id_Patron  );

    Patron updateById(Long id_Patron, Patron updatedPatron);
}
