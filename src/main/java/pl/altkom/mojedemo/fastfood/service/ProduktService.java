package pl.altkom.mojedemo.fastfood.service;

import org.springframework.stereotype.Service;
import pl.altkom.mojedemo.fastfood.entity.Produkt;
import pl.altkom.mojedemo.fastfood.repository.OldProduktRepository;

import java.util.List;

@Service
public class ProduktService {

    private final OldProduktRepository oldProduktRepository;

    public ProduktService(OldProduktRepository oldProduktRepository) {
        this.oldProduktRepository = oldProduktRepository;
    }

    public List<Produkt> pobierzWszystkie() {
        return oldProduktRepository.findAll();
    }

    public void dodaj(Produkt produkt) {
        oldProduktRepository.save(produkt);
    }

}
