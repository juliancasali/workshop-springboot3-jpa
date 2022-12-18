package com.example.projectspringboot.resources;

/*
Na abordagem do Spring para construir serviços da Web RESTful, as solicitações HTTP são tratadas por um controlador.
Esses componentes são identificados pela anotação @RestController.
A anotação garante que as solicitações HTTP GET @RequestMapping.
 */

import com.example.projectspringboot.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria","maria@gmail.com","999998888","12345");
        return ResponseEntity.ok().body(u);

    }
}
