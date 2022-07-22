package joalheria.meli.repositories;

import joalheria.meli.models.Jewel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJewelRepo extends CrudRepository<Jewel, Long> {
}
