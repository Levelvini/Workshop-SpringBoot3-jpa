package com.LevelVini.course.resources;

import com.LevelVini.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1,"zé","zé@gmail.com","91959698","peido molhado");
        return ResponseEntity.ok().body(u);
    }

}
