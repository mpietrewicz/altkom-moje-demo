package pl.altkom.mojedemo.fastfood.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@RequiredArgsConstructor
@Getter
@Setter
public class Produkt {

    @Id
    @SequenceGenerator(name = "produkt_sequence", sequenceName = "produkt_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produkt_sequence")
    private Long id;
    private String nazwa;
    private BigDecimal cena;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Zamowienie zamowienie;

    public Produkt(String nazwa, BigDecimal cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
}
