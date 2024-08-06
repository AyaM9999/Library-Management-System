package ayaMahmoud.example.Library.services;


import ayaMahmoud.example.Library.models.entity.Patron;
import ayaMahmoud.example.Library.repo.PatronRepository;
import ayaMahmoud.example.Library.Exception.patronNotFoundException;
import java.util.List;
import java.util.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@AllArgsConstructor
class patronServiceImpl implements PatronServiceInterface  {

  private final PatronRepository patronRepository;
    public  List<Patron> getAllPatrons() {
        return patronRepository.findAll();
    }


    /**
     * @param patron
     * @return
     */
    @Override
    public Patron add(Patron patron) {
        return patronRepository.save(patron);
    }

    /**
     * @param patron
     * @return
     */
    @Override
    public Patron update(Patron patron) {

        return null;
    }

    /**
     * @param patron
     * @return
     */
    @Override
    public Patron save(Patron patron) {
       return patronRepository.save(patron);
    }

    /**
     * @param id_Patron
     * @return
     */
    @Override
    public Patron findPatronById(Long id_Patron) {
       return patronRepository.findById(id_Patron).orElse(null);
    }

    /**
     * @return
     */
    @Override
    public List<Patron> findAllPatron() {
        return patronRepository.findAll();

    }

    /**
     * @param id_Patron
     */
    @Override
    public void deleteById(Long id_Patron) {
      Patron patron= patronRepository.findById(id_Patron).orElse(null);
      patronRepository.delete(patron);
    }

    /**
     * @param id_Patron
     * @param updatedPatron
     * @return
     */
    @Override
    public Patron updateById(Long id_Patron, Patron updatedPatron) {

      Patron patron=  patronRepository.findById(id_Patron).orElseThrow();
      patron.setName(updatedPatron.getName());
      patron.setEmail(updatedPatron.getEmail());
      patron.setPhone(updatedPatron.getPhone());
      patron.setAge(updatedPatron.getAge());
      patron.setAddress(updatedPatron.getAddress());
      patronRepository.save(patron);
      return patron;



    }
}
