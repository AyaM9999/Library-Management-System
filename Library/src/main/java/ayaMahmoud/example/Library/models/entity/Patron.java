package ayaMahmoud.example.Library.models.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Data
@Builder
@AllArgsConstructor



public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Patron;
    public String name;
    public String phone;
    public String email;
    public String address;
    public int age;



    public Patron(){}

    @OneToMany(mappedBy = "Patron" , cascade = CascadeType.ALL)
    public List <Borrowings> Borrowings;


}
