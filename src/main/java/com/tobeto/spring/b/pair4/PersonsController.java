package com.tobeto.spring.b.pair4;

import org.springframework.web.bind.annotation.*;
import com.tobeto.spring.b.pair4.models.Person;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/persons")
public class PersonsController {

    List<Person> inMemoryList = new ArrayList<>();

    @GetMapping
    public List<Person> get(){
        return inMemoryList;
    }

    @GetMapping("{id}")
    public Person getById(@PathVariable int id){
        Person person = inMemoryList.stream().filter((p) -> p.getId() == id).findFirst().orElseThrow();
        return person;
    }

    @PostMapping
    public String add(@RequestBody Person person) {
        inMemoryList.add(person);
        return person.getId()+" ID' li kullanıcı sisteme eklendi.";
    }

    @PutMapping
    public String update(@RequestBody Person updatedPerson){
        Person person = inMemoryList
                .stream()
                .filter((p) -> p.getId() == updatedPerson.getId())
                .findFirst()
                .orElseThrow();
        person.setAge(updatedPerson.getAge());
        person.setName(updatedPerson.getName());
        person.setSurname(updatedPerson.getSurname());

        return person.getId()+" ID' li kullanıcı güncellendi.";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        Person person = inMemoryList
                .stream()
                .filter((p) -> p.getId() == id)
                .findFirst()
                .orElseThrow();
        inMemoryList.remove(person);
        return id+" ID' li kullanıcı silindi.";
    }
}
