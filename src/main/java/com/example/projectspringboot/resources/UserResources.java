package com.example.projectspringboot.resources;

/*
Na abordagem do Spring para construir serviços da Web RESTful, as solicitações HTTP são tratadas por um controlador.
Esses componentes são identificados pela anotação @RestController.
A anotação garante que as solicitações HTTP GET @RequestMapping.
 */

import com.example.projectspringboot.entities.User;
import com.example.projectspringboot.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
