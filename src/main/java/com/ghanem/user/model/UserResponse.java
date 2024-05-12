package com.ghanem.user.model;

import lombok.Builder;

import java.time.LocalDate;
@Builder
public record UserResponse(String id,
                           String name,
                           String email,
                           String phone,
                           String address,
                           String city,
                           String state,
                           String postalCode,
                           Boolean isPreferred,
                           LocalDate birthDate) {
}
