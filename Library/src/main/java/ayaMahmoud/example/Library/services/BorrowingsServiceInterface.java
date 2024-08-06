package ayaMahmoud.example.Library.services;
import ayaMahmoud.example.Library.models.entity.Borrowings;

import java.time.LocalDate;

public interface BorrowingsServiceInterface {


    Borrowings borrowBook(Long bookId, Long patronId, LocalDate DateBorrowing_MustReturnIn);

    Borrowings returnBook(Long bookId, Long patronId, LocalDate DateBorrowing_ActualReturn);
}

