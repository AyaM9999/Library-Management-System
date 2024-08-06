package ayaMahmoud.example.Library.services;

import ayaMahmoud.example.Library.repo.*;
import ayaMahmoud.example.Library.models.entity.Borrowings;
 import ayaMahmoud.example.Library.models.entity.*;
import ayaMahmoud.example.Library.services.*;
import ayaMahmoud.example.Library.repo.BorrowingsRepository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.time.Period;
import java.time.LocalDate;

@Builder
@Service
@AllArgsConstructor


//@Transactional(propagation = Propagation.REQUIRES_NEW)
public class borrowingsServiceImpl implements BorrowingsServiceInterface  {

    @Autowired
     public bookServiceImpl bookserviceimpl;

    @Autowired
     public patronServiceImpl patronServiceImpl;

    @Autowired
      private  final bookServiceInterface bookServiceInterface;
    @Autowired
     private final patronServiceImpl patronServiceInterface;

    @Autowired
     public BorrowingsRepository borrowingsRepository;





    @Override
    public Borrowings borrowBook(Long bookId, Long patronId, LocalDate ateBorrowing_MustReturnIn) {
        Book book =bookServiceInterface.findById(bookId);
        Patron patron=patronServiceInterface.findPatronById(patronId);
        Borrowings borrowing= Borrowings.builder()
                .book(book)
                .patron(patron)
                .DateBorrowing_ActualReturn(null)
                .DateBorrowing_MustReturnIn(LocalDate.now())
                .DateBorrowing(LocalDate.now()).build();
        return borrowingsRepository.save(borrowing);
    }


    @Override
    public Borrowings returnBook(Long bookId, Long patronId, LocalDate DateBorrowing_ActualReturn) {
        Book book =bookServiceInterface.findById(bookId);
        Patron patron=patronServiceInterface.findPatronById(patronId);

        Borrowings borrowing =borrowingsRepository.
                findBorrowingsByPatronAndBook(patron,book).orElseThrow();



        borrowing.setDateBorrowing_ActualReturn(LocalDate.now());

        borrowingsRepository.save(borrowing);

        return borrowing;

    }

}
