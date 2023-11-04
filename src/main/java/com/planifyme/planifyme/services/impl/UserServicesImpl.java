package com.planifyme.planifyme.services.impl;

import com.planifyme.planifyme.dto.UserDto;
import com.planifyme.planifyme.models.User;
import com.planifyme.planifyme.repository.UserRepository;
import com.planifyme.planifyme.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserServicesImpl implements UserServices {
    private final UserRepository userRepository;
    @Autowired

    public UserServicesImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }




    @Override
    public List<UserDto> findAllClubs() {
       List<User> users = userRepository.findAll();
        return users.stream().map(this::mapToUserDto).collect(Collectors.toList());
    }
    private UserDto mapToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .namaLengkap(user.getNamaLengkap())
                .username(user.getUsername())
                .build();
    }
}
