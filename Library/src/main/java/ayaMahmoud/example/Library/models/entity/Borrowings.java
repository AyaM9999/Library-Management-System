package ayaMahmoud.example.Library.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString


public class Borrowings implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id_borrowing;

    public LocalDate DateBorrowing ;
    public LocalDate DateBorrowing_MustReturnIn ;
    public LocalDate DateBorrowing_ActualReturn;

    public Float paidFeesAmountOfBorrowing ;




    @ManyToOne
    @JoinColumn(name = "id_patron")
    public Patron patron;

    @ManyToOne
    @JoinColumn(name="'id_book'")
    public Book book;

    public Borrowings(){}



}
