package ayaMahmoud.example.Library.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.*;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import ayaMahmoud.example.Library.models.entity.Borrowings;
import ayaMahmoud.example.Library.services.borrowingsServiceImpl;
import ayaMahmoud.example.Library.services.BorrowingsServiceInterface;
@RestController
@RequestMapping("/Api")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Tag (name="Borrowings",description="Borrowings API Endpoints")


public class BorrowingsController  {
    @Autowired
     borrowingsServiceImpl borrowingsServiceimpl;
    @Autowired
    BorrowingsServiceInterface borrowingsServiceInterface;

    @PostMapping("/borrow/{bookId}/patron/{patronId}")
    public Borrowings borrowBook(@PathVariable Long id_book,
                                 @PathVariable Long id_Patron,@PathVariable LocalDate DateBorrowing_MustReturnIn) {
        return borrowingsServiceInterface.borrowBook(id_book, id_Patron,DateBorrowing_MustReturnIn);
    }

    @PutMapping("/return/{bookId}/patron/{patronId}")
    public void returnBook(@PathVariable Long bookId,
                           @PathVariable Long patronId
    , @PathVariable LocalDate DateBorrowing_ActualReturn) {
        borrowingsServiceInterface.returnBook(bookId, patronId,DateBorrowing_ActualReturn);
    }







}
