package pl.altkom.mojedemo.fastfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import pl.altkom.mojedemo.fastfood.entity.Produkt;

@RestResource(path = "produkty", rel = "wszystkie-produkty")
public interface ProduktRepository extends JpaRepository<Produkt, Long> {

}