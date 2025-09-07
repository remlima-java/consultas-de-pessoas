package br.dev.rti.consultaspessoas.service;

import br.dev.rti.consultaspessoas.entity.Person;
import br.dev.rti.consultaspessoas.entity.tdos.PersonDto;
import br.dev.rti.consultaspessoas.exceptions.CashNotFoundException;
import br.dev.rti.consultaspessoas.exceptions.CpfNotFoundException;
import br.dev.rti.consultaspessoas.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    private final CashService cashService;

    private final ModelMapper modelMapper;


    public PersonDto save(PersonDto personDto) {

        if (personDto.getPayMent() == null)
            throw new CashNotFoundException("Payment not found");

        if (personDto.getCpf() == null)
            throw new CpfNotFoundException("Cpf not found");

        this.cashService.pay(personDto.getPayMent());
        this.personRepository.save(this.modelMapper.map(personDto, Person.class));
        return personDto;

    }

//
//    public Person findById(Long id) {
//       return this.personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException("Usuario nao encontrado luvinha"));
//    }
//
//    public List<Person> findAll() {
//        return this.personRepository.findAll();
//    }
//
//    public Person update(Person person) {
//        return this.personRepository.save(person);
//    }
//
//    public void delete(Long id) {
//        this.personRepository.deleteById(id);
//    }
}
