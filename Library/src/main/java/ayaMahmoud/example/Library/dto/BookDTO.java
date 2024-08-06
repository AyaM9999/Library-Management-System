package ayaMahmoud.example.Library.dto;
import java.time.*;



import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(name="Book",description = "Book Model")
@JsonInclude(JsonInclude.Include.NON_NULL) // to avoid null values during serialization.

public class BookDTO {


    private int id_book;

    @NotBlank (message="Title is required ")
    public String title;

    @NotBlank (message="Author name is required ")
    public String author;

    public String description;


    @PastOrPresent(message = "Note,The year of publication must not be in the future.")
    @NotBlank(message=" publication year is required ")
    @Schema(example="2024")

    public Year publicationYear;

    public String publisher;

    @NotBlank (message="ISBN is required ")
    @Schema(example="5996314669312")
    @ISBN(message="Invalid ISBN")
    public String isbn;
}
