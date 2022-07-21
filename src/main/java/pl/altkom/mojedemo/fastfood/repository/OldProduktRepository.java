package pl.altkom.mojedemo.fastfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.altkom.mojedemo.fastfood.entity.Produkt;

@Repository
public interface OldProduktRepository extends JpaRepository<Produkt, Long> {

}
