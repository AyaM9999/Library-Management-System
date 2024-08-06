package ayaMahmoud.example.Library.services;

import ayaMahmoud.example.Library.models.entity.Book;
import ayaMahmoud.example.Library.repo.BookRepository;

import ayaMahmoud.example.Library.Exception.bookNotFoundException;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


@Service
@Transactional()
@AllArgsConstructor
public class bookServiceImpl implements bookServiceInterface {

    private static final Logger log = LoggerFactory.getLogger(bookServiceImpl.class);
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * @param Book
     * @return
     */
    @Override
    public Book save(Book Book) {
        return bookRepository.save(Book);

    }

    /**
     * @param id_book
     * @return
     */
    @Override
    public Book getBookById(Long id_book) {
        log.info("getBookById");
        return bookRepository.findById(id_book).orElseThrow();
    }

    /**
     * @param id_book
     * @return
     */
    @Override
    public Book findById(Long id_book) {
        log.info("findById");
        return bookRepository.findById(id_book).orElseThrow();
    }

    /**
     * @return
     */
    @Override
    public List<Book> findAllBooks() {
        log.info("findAllBooks");
        return bookRepository.findAll();
    }

    @Override
    public void deleteById (Long id){
        log.info("deleteById");
        bookRepository.deleteById(id);
  }


    /**
     * @param id
     * @param newBookInfoToUpdateWithIt
     * @return
     */
    @Override
    public Book updateById(Long id, Book newBookInfoToUpdateWithIt) {
        log.info("updateById(id:{},updatedBook:{})",id,newBookInfoToUpdateWithIt);
        Book Book = bookRepository.findById(id).orElseThrow();
        Book.setTitle(newBookInfoToUpdateWithIt.getTitle());
        Book.setIsbn(newBookInfoToUpdateWithIt.getIsbn());
        Book.setAuthor(newBookInfoToUpdateWithIt.getAuthor());
        Book.setPublicationYear(newBookInfoToUpdateWithIt.getPublicationYear());
        Book.setDescription(newBookInfoToUpdateWithIt.getDescription());
        bookRepository.save(Book);
        return Book;


    }


}