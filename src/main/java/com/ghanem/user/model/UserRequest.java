package com.ghanem.user.model;

import java.time.LocalDate;

public record UserRequest(String name,
                          String email,
                          String phone,
                          String address,
                          String city,
                          String state,
                          String postalCode,
                          Boolean isPreferred,
                          LocalDate birthDate) {
}
