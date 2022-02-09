package academy.digital.store.serviceproduct.entity;

import lombok.*;

import javax.persistence.*;

@Entity //Clase de objetos de tablas
@Table(name="tbl_categories") //En caso de que la clase se llame diferente a la tabla
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
