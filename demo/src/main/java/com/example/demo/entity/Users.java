package com.example.demo.entity;

import javax.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Entity
public class Users{

    @Id
    @GeneratedValue
    private Long id;

    private String userId;

    private String userPw;

    private String name;

    private String email;


    @Builder
    public Users(String userId,String userPw,String name,String email){
        this.userId=userId;
        this.userPw=userPw;
        this.name=name;
        this.email=email;
    }
}