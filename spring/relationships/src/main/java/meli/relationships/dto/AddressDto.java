package meli.relationships.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import meli.relationships.models.Address;

@Data
@NoArgsConstructor
public class AddressDto {
    private String location;

    public AddressDto(Address address) {
        this.location = address.getLocation();
    }
}
