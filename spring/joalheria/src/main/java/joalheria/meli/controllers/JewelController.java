package joalheria.meli.controllers;

import joalheria.meli.models.Jewel;
import joalheria.meli.services.JewelService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
