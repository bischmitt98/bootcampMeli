package joalheria.meli.services;

import joalheria.meli.models.Jewel;

import java.util.List;

public interface IJewelService {
    Jewel getJewelById(long id);
    List<Jewel> getAllJewels();
    Jewel createJewel(Jewel newJewel);
    void deleteJewel(long id);
    Jewel updateJewel(Jewel jewel);
}
