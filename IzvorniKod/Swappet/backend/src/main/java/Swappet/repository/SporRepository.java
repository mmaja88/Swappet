package Swappet.repository;

import Swappet.model.Korisnik;
import Swappet.model.Spor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SporRepository extends JpaRepository<Spor, Integer> {

    Spor findByTuzen(Korisnik korisniks);

}