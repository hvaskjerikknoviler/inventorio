package struts.inventorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import struts.inventorio.entities.Beer;

@Repository
public interface BeerRepo extends JpaRepository<Beer, Integer> {
}

