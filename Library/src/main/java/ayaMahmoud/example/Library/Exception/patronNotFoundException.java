package ayaMahmoud.example.Library.Exception;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import ayaMahmoud.example.Library.models.entity.Patron;
 import java.io.*;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class patronNotFoundException extends RuntimeException {

    public patronNotFoundException(Long id_patron) {
        super("Patron with id " + id_patron + " does not exist.");
    }
}
