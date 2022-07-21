package pl.altkom.mojedemo.fastfood.service;

import org.springframework.stereotype.Service;
import pl.altkom.mojedemo.fastfood.entity.Produkt;
import pl.altkom.mojedemo.fastfood.repository.ProduktRepository;

import java.util.List;

@Service
public class ProduktService {

    private final ProduktRepository produktRepository;

    public ProduktService(ProduktRepository produktRepository) {
        this.produktRepository = produktRepository;
    }

    public List<Produkt> pobierzWszystkie() {
        return produktRepository.findAll();
    }

    public void dodaj(Produkt produkt) {
        produktRepository.save(produkt);
    }

}
