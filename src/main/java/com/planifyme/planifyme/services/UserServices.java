package com.planifyme.planifyme.services;

import com.planifyme.planifyme.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserServices {
    List<UserDto> findAllClubs();
}
