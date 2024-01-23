package struts.inventorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import struts.inventorio.entities.Beverages;

@Repository
public interface beveragesRepo<T extends Beverages> extends JpaRepository<T, Integer> {
}
