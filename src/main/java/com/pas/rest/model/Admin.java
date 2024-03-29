package com.pas.rest.model;

import lombok.*;

@Getter
@Setter
public class Admin extends User {
    
    private final String accessLevel = "ADMIN";

    public Admin() {
        super();
    }

    public Admin(String name, String login, String password) {
        super(name, login, password);
    }

    @Override
    public String toString() {
        return "\nAdministrator" + super.toString();
    }
}
