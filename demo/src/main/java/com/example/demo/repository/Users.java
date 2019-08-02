package com.example.demo.repository;

import javax.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Users{

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500,nullable = false)
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