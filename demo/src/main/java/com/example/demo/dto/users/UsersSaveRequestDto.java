package com.example.demo.dto.users;

import com.example.demo.repository.Users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsersSaveRequestDto{

    private String userId;

    private String userPw;

    private String name;

    private String email;

    public Users toEntity(){
        return Users.builder()
            .userId(userId)
            .userPw(userPw)
            .name(name)
            .email(email)
            .build();
    }

}