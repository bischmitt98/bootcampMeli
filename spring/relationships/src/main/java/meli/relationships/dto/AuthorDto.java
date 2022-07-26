package meli.relationships.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import meli.relationships.models.Address;
import meli.relationships.models.Author;

import javax.persistence.Column;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
public class AuthorDto {
    private String name;
    private AddressDto addressDto;

    public AuthorDto(Author author) {
        this.name = author.getName();
        this.addressDto = new AddressDto(author.getAddress());
    }
}
