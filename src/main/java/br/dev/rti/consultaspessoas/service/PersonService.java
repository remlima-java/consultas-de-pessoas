package br.dev.rti.consultaspessoas.service;

import br.dev.rti.consultaspessoas.entity.Person;
import br.dev.rti.consultaspessoas.exceptions.UsarNotFindException;
import br.dev.rti.consultaspessoas.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    public final PersonRepository personRepository;


    public Person save(Person person) {
        return this.personRepository.save(person);
    }


    public Person findById(Long id) {
       return this.personRepository.findById(id).orElseThrow(() -> new UsarNotFindException("Usuario nao encontrado luvinha"));
    }

    public List<Person> findAll() {
        return this.personRepository.findAll();
    }

    public Person update(Person person) {
        return this.personRepository.save(person);
    }

    public void delete(Long id) {
        this.personRepository.deleteById(id);
    }
}
