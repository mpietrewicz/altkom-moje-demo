package pl.altkom.mojedemo.fastfood.service;

import org.springframework.stereotype.Service;
import pl.altkom.mojedemo.fastfood.entity.Zamowienie;
import pl.altkom.mojedemo.fastfood.entity.ZamowienieRepository;

import java.util.List;

@Service
public class ZamowienieService {

    private final ZamowienieRepository zamowienieRepository;

    public ZamowienieService(ZamowienieRepository zamowienieRepository) {
        this.zamowienieRepository = zamowienieRepository;
    }

    public List<Zamowienie> pobierzWszystkie() {
        return zamowienieRepository.findAll();
    }

    public void dodaj(Zamowienie zamowienie) {
        zamowienieRepository.save(zamowienie);
    }

}
