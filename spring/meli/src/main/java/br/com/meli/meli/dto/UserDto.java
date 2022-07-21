package br.com.meli.meli.dto;

import br.com.meli.meli.models.User;

public class UserDto {
    String name;

    public UserDto(User user){
        this.name = user.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
