package meli.cascading.controllers;

import meli.cascading.models.Actors;
import meli.cascading.services.ActorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cascading")
public class ActorsController {
    @Autowired
    ActorsService actorsService;

    @GetMapping("/{id}")
    public ResponseEntity<Actors> getActorById(@PathVariable int id){
        return ResponseEntity.ok(actorsService.getActorById(id));
    }

    @PostMapping
    public ResponseEntity<Actors> add(@RequestBody Actors actors){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(actorsService.add(actors));
    }

    @PutMapping
    public ResponseEntity<Actors> update(@RequestBody Actors actors){
        return ResponseEntity.ok(actorsService.update(actors));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        actorsService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
