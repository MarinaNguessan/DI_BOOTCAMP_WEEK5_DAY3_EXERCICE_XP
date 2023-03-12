package adaci.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import adaci.bootcamp.models.ToDo;

public class ToDoRepository extends ReactiveMongoRepository<ToDo, Integer> {

    public Object findAll() {
        return null;
    }

}
