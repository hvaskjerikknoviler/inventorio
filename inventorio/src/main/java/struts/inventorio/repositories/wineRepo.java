package struts.inventorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import struts.inventorio.entities.Wine;

@Repository
public interface wineRepo extends JpaRepository<Wine, Integer> {
}
