package pl.altkom.mojedemo.fastfood.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@RequiredArgsConstructor
@Getter
@Setter
public class Zamowienie {

    @Id
    @SequenceGenerator(name = "zamowienie_sequence", sequenceName = "zamowienie_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zamowienie_sequence")
    private Long id;
    private String nazwa;
    private LocalDate dataRejestracji;

    @OneToMany(mappedBy = "zamowienie")
    private List<Produkt> listaProduktow;

    public Zamowienie(String nazwa, List<Produkt> listaProduktow) {
        this.nazwa = nazwa;
        this.dataRejestracji = LocalDate.now();
        this.listaProduktow = listaProduktow;
    }
}
