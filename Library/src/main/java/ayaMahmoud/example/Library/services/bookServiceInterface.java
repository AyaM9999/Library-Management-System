package ayaMahmoud.example.Library.services;
import ayaMahmoud.example.Library.models.entity.Book;

import java.util.*;

public interface bookServiceInterface {
        Book save (Book Book);
        Book getBookById (Long id_book);
        Book findById (Long id_book);
        List<Book> findAllBooks ();
        public void deleteById (Long id_book);


        Book updateById (Long id_Book,Book newBookInfoToUpdateWithIt);
}
