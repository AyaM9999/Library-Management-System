package ayaMahmoud.example.Library.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(name="Patron", description = "patron Model")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class patronDTO {


    private int id_Patron;

    @NotBlank(message="Name is required")
    public String name;


    @NotBlank(message="Phone Number is required")
    @Schema(example="+201068993312")
    @Pattern(regexp = "")
    public String phone;

    @Email
    @NotBlank(message="Name is required")
    public String email;

    @NotBlank(message="Address is required")
    public String address;

    @NotBlank(message="Age is required")
    public int age;


}
