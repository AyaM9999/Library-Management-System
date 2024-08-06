package ayaMahmoud.example.Library.Exception;
import ayaMahmoud.example.Library.models.entity.Borrowings;
import java.io.IOException;
import java.util.*;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class borrowingsNotFound extends RuntimeException {

   public borrowingsNotFound(Long book_id, Long patron_id) {

       super(" The book that its id is "+ book_id+ " not borrowed by the patron that has id = "+patron_id);
   }
}
