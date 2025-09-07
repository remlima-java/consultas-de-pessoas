package br.dev.rti.consultaspessoas.service;

import br.dev.rti.consultaspessoas.entity.Person;
import br.dev.rti.consultaspessoas.entity.dtos.PersonDto;
import br.dev.rti.consultaspessoas.exceptions.CashNotFoundException;
import br.dev.rti.consultaspessoas.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final ModelMapper modelMapper = new ModelMapper();


    public PersonDto save(PersonDto personDto) {

        if (personDto.getPayMent() == null)
            throw new CashNotFoundException("Payment not found!! Safado!");

        Person map = this.modelMapper.map(personDto, Person.class);
        this.personRepository.save(map);
        return personDto;

    }
}


//public PersonDto findById(Long id) {
//    return this.personRepository.findById(id).orElseThrow(() -> new UsarNotFindException("Usuario nao encontrado luvinha"));
//}
//
//public List<PersonDto> findAll() {
//    return this.personRepository.findAll();
//}
//
//public PersonDto update(PersonDto person) {
//    return this.personRepository.save(person);
//}
//
//public void delete(Long id) {
//    this.personRepository.deleteById(id);
//}
//}
