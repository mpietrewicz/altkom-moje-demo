package pl.altkom.mojedemo.fastfood.controller;

import org.springframework.web.bind.annotation.*;
import pl.altkom.mojedemo.fastfood.entity.Produkt;
import pl.altkom.mojedemo.fastfood.service.ProduktService;

import java.util.List;

@RestController
@RequestMapping(path = "api/produkt")
public class ProduktController {

    private final ProduktService produktService;

    public ProduktController(ProduktService produktService) {
        this.produktService = produktService;
    }

    @GetMapping
    public List<Produkt> pobierzWszystkieProdukty() {
        return produktService.pobierzWszystkie();
    }

    @PostMapping(path = "/dodaj")
    public void dodajProdukt(@RequestBody Produkt produkt) {
        produktService.dodaj(produkt);
    }
}
