package pl.altkom.mojedemo.fastfood.controller;

import org.springframework.web.bind.annotation.*;
import pl.altkom.mojedemo.fastfood.entity.Zamowienie;
import pl.altkom.mojedemo.fastfood.service.ZamowienieService;

import java.util.List;

@RestController
@RequestMapping(path = "api/zamowienie")
public class ZamowienieController {

    private final ZamowienieService zamowienieService;

    public ZamowienieController(ZamowienieService zamowienieService) {
        this.zamowienieService = zamowienieService;
    }

    @GetMapping
    public List<Zamowienie> pobierzWszystkieZamowienia() {
        return zamowienieService.pobierzWszystkie();
    }

    @PostMapping(path = "/dodaj")
    public void dodajZamowienie(@RequestBody Zamowienie zamowienie) {
        zamowienieService.dodaj(zamowienie);
    }
}
