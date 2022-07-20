package pl.altkom.mojedemo.fastfood.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@AllArgsConstructor
@Getter
@Setter
public class Produkt {

    @Id
    @SequenceGenerator(name = "produkt_sequence", sequenceName = "produkt_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produkt_sequence")
    private Long id;
    private String nazwa;
    private BigDecimal cena;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Zamowienie zamowienie;

}
