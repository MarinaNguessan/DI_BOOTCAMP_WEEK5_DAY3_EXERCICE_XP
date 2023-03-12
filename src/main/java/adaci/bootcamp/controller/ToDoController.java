package adaci.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adaci.bootcamp.models.ToDo;
import adaci.bootcamp.repository.ToDoRepository;

import java.util.List;

@RestController

public class ToDoController {
    @Autowired
    private ToDoRepository repository;

    @GetMapping("")
    private ResponseEntity<List<ToDo>> getAll() {
        return ResponseEntity.ok(repository.findAll().collectList().block());
    }
    
}
