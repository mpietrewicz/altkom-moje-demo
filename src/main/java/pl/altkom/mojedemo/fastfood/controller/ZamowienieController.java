package pl.altkom.mojedemo.fastfood.controller;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
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

    @GetMapping(path = "/{id}")
    public EntityModel<Zamowienie> pobierzZamowienie(@PathVariable("id") Long id) {
        Zamowienie zamowienie = zamowienieService.getById(id);
        EntityModel<Zamowienie> model = EntityModel.of(zamowienie);
        WebMvcLinkBuilder linkDoZamowien = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass())
                .pobierzWszystkieZamowienia());
        model.add(linkDoZamowien.withRel("wszystkie-zamowienia"));
        return model;
    }

    @PostMapping(path = "/dodaj")
    public void dodajZamowienie(@RequestBody Zamowienie zamowienie) {
        zamowienieService.dodaj(zamowienie);
    }
}
