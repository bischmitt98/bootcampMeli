package meli.cascading.services;

import meli.cascading.models.Actors;
import org.springframework.stereotype.Service;

@Service
public interface IActorsService {
    Actors add(Actors actors);
    Actors getActorById(int id);
    Actors update(Actors actors);
    void delete(int id);
}
