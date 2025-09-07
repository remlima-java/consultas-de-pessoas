package br.dev.rti.consultaspessoas.controller;

import br.dev.rti.consultaspessoas.entity.dtos.PersonDto;
import br.dev.rti.consultaspessoas.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/person")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;


    @PostMapping
    public ResponseEntity<PersonDto> save(@RequestBody PersonDto personDto) {
        return ResponseEntity.ok(this.personService.save(personDto));
    }
/*
    @GetMapping
    public ResponseEntity<List<PersonDto>> findAll() {
        return ResponseEntity.ok(this.personService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDto> findOne(@PathVariable Long id) {
        return ResponseEntity.ok(this.personService.findById(id));
    }

    @PutMapping
    public ResponseEntity<PersonDto> update(@RequestBody Person person) {
        return ResponseEntity.ok(this.personService.update(person));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.personService.delete(id);
        return ResponseEntity.noContent().build();
    }*/
}
