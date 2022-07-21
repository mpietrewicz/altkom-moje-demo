package pl.altkom.mojedemo.fastfood;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.altkom.mojedemo.fastfood.entity.Produkt;
import pl.altkom.mojedemo.fastfood.entity.Zamowienie;
import pl.altkom.mojedemo.fastfood.repository.OldProduktRepository;
import pl.altkom.mojedemo.fastfood.repository.ZamowienieRepository;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class InicjacjaZamowien {

    private final ZamowienieRepository zamowienieRepository;
    private final OldProduktRepository oldProduktRepository;

    public InicjacjaZamowien(ZamowienieRepository zamowienieRepository, OldProduktRepository oldProduktRepository) {
        this.zamowienieRepository = zamowienieRepository;
        this.oldProduktRepository = oldProduktRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner(ZamowienieRepository studentRepository) {
        return args -> {
            Produkt burger = new Produkt("burger", new BigDecimal(15));
            Produkt frytki = new Produkt("frytki", new BigDecimal(9));
            Produkt cola = new Produkt("cola", new BigDecimal(9));
            oldProduktRepository.save(burger);
            oldProduktRepository.save(frytki);
            oldProduktRepository.save(cola);


//            Zamowienie zamowienie1 = new Zamowienie("zam 1", List.of(burger, frytki, cola));
            Zamowienie zamowienie1 = new Zamowienie("zam 1");

            zamowienieRepository.save(zamowienie1);
        };
    }

}
