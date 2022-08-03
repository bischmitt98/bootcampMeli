package meli.cascading.services;

import meli.cascading.models.Actors;
import meli.cascading.repositories.IActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorsService implements IActorsService{

    @Autowired
    private IActorRepo actorRepo;

    @Override
    public Actors add(Actors actors) {
        return actorRepo.save(actors);
    }

    @Override
    public Actors getActorById(int id) {
        return actorRepo.findById(id).get();
    }

    @Override
    public Actors update(Actors actors) {
        Actors foundActor = getActorById(actors.getId());
        return actorRepo.save(foundActor);
    }

    @Override
    public void delete(int id) {
        Actors actors = getActorById(id);
        actorRepo.delete(actors);
    }
}
