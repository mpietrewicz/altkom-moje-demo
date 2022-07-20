package pl.altkom.mojedemo.fastfood.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@AllArgsConstructor
@Getter
@Setter
public class Zamowienie {

    @Id
    @SequenceGenerator(name = "zamowienie_sequence", sequenceName = "zamowienie_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zamowienie_sequence")
    private Long id;
    private LocalDate dataZamowienie;

    @OneToMany(mappedBy = "zamowienie")
    private List<Produkt> listaProduktow;

}
