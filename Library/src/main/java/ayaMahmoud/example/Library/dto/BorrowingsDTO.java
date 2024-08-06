package ayaMahmoud.example.Library.dto;
import ayaMahmoud.example.Library.models.entity.Borrowings;
import ayaMahmoud.example.Library.models.entity.Patron;
import ayaMahmoud.example.Library.models.entity.Book;
import ayaMahmoud.example.Library.dto.patronDTO;
import ayaMahmoud.example.Library.dto.BookDTO;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(name="Borrowings", description = "Borrowings Model")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BorrowingsDTO {


    private int id_borrowing;

    public LocalDate DateBorrowing ;



    public LocalDate DateBorrowing_MustReturnIn ;

    public LocalDate DateBorrowing_ActualReturn;

    public Float paidFeesBorrowing ;

    public BookDTO Book;

    public patronDTO patron;
}
