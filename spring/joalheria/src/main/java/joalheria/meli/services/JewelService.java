package joalheria.meli.services;

import joalheria.meli.exceptions.NotFoundException;
import joalheria.meli.models.Jewel;
import joalheria.meli.repositories.IJewelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JewelService implements IJewelService{

    @Autowired
    private IJewelRepo jewelRepo;

    @Override
    public Jewel getJewelById(long id) {
        return jewelRepo.findById(id).orElseThrow(()->
                new NotFoundException("Jewel not found. Id: " + id));
    }

    @Override
    public List<Jewel> getAllJewels() {
        return (List<Jewel>) jewelRepo.findAll();
    }

    @Override
    public Jewel createJewel(Jewel newJewel) {
        return null;
    }

    @Override
    public void deleteJewel(long id) {

    }

    @Override
    public Jewel updateJewel(Jewel jewel) {
        return null;
    }
}
