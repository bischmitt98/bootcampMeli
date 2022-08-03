package meli.cascading.repositories;

import meli.cascading.models.Actors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActorRepo extends CrudRepository<Actors, Integer> {
}
