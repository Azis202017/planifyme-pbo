package com.planifyme.planifyme.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class UserDto {
    private int id;
    private String namaLengkap;
    private String username;
    private String password;
}
