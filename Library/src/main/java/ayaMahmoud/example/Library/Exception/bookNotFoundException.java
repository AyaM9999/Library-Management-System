package ayaMahmoud.example.Library.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class bookNotFoundException extends RuntimeException {

   public bookNotFoundException(Long id_book) {

       super( "Book that its Id is "+id_book+"Book not found");
   }

}