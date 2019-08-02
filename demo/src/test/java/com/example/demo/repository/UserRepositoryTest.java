package com.example.demo.repository;


import java.util.List;



import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.repository.Users;
import com.example.demo.repository.UserRepository;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest{
    
    @Autowired
    UserRepository userRepository;

    @After
    public void cleanup(){
        userRepository.deleteAll();
    }

    @Test
    public void user_ss(){
        userRepository.save(Users.builder()
            .userId("rlaansrl")
            .userPw("rlaansrl93")
            .name("김문기")
            .email("ansrlwjstk@naver.com")
            .build());

        List<Users> userList = userRepository.findAll();

        Users users = userList.get(0);
        assertThat(users.getUserId(),is("rlaansrl"));
        assertThat(users.getUserPw(),is("rlaansrl93"));
        assertThat(users.getEmail(),is("ansrlwjstk@naver.com"));
        assertThat(users.getName(),is("김문기"));

    }
}