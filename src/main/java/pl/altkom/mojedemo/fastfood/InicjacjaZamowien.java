package pl.altkom.mojedemo.fastfood;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.altkom.mojedemo.fastfood.entity.Produkt;
import pl.altkom.mojedemo.fastfood.entity.Zamowienie;
import pl.altkom.mojedemo.fastfood.repository.ProduktRepository;
import pl.altkom.mojedemo.fastfood.repository.ZamowienieRepository;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class InicjacjaZamowien {

    private final ZamowienieRepository zamowienieRepository;
    private final ProduktRepository produktRepository;

    public InicjacjaZamowien(ZamowienieRepository zamowienieRepository, ProduktRepository produktRepository) {
        this.zamowienieRepository = zamowienieRepository;
        this.produktRepository = produktRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner(ZamowienieRepository studentRepository) {
        return args -> {
            Produkt burger = new Produkt("burger", new BigDecimal(15));
            Produkt frytki = new Produkt("frytki", new BigDecimal(9));
            Produkt cola = new Produkt("cola", new BigDecimal(9));
            produktRepository.save(burger);
            produktRepository.save(frytki);
            produktRepository.save(cola);

            Zamowienie zamowienie1 = new Zamowienie("zam 1", List.of(burger, frytki, cola));
            Zamowienie zamowienie2 = new Zamowienie("zam 2", List.of(frytki, cola));

            zamowienieRepository.save(zamowienie1);
        };
    }

}
