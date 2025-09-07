package br.dev.rti.consultaspessoas.controller;

import br.dev.rti.consultaspessoas.entity.Person;
import br.dev.rti.consultaspessoas.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/person")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;


    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person) {
        return ResponseEntity.ok(this.personService.save(person));
    }

    @GetMapping
    public ResponseEntity<List<Person>> findAll() {
        return ResponseEntity.ok(this.personService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> findOne(@PathVariable Long id) {
        return ResponseEntity.ok(this.personService.findById(id));
    }

    @PutMapping
    public ResponseEntity<Person> update(@RequestBody Person person) {
        return ResponseEntity.ok(this.personService.update(person));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.personService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
