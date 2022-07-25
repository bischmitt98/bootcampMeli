package joalheria.meli.controllers;

import joalheria.meli.models.Jewel;
import joalheria.meli.services.JewelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/jewel")
public class JewelController {

    @Autowired
    private JewelService jewelService;

    @GetMapping("/{id}")
    public ResponseEntity<Jewel> getJewelById(@PathVariable long id){
        return ResponseEntity.ok(jewelService.getJewelById(id));
    }

    @GetMapping
    public ResponseEntity<List<Jewel>> getAllJewels(){
        return ResponseEntity.ok(jewelService.getAllJewels());
    }

    @PostMapping
    public ResponseEntity<Jewel> createJewel(@RequestBody Jewel jewel){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(jewelService.createJewel(jewel));
    }

    @PutMapping
    public ResponseEntity<Jewel> updateJewel(@RequestBody Jewel jewel){
        return ResponseEntity.ok(jewelService.updateJewel(jewel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJewel(@PathVariable long id){
        jewelService.deleteJewel(id);
        return ResponseEntity.noContent().build();
    }
}
