package br.dev.rti.consultaspessoas.repository;

import br.dev.rti.consultaspessoas.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
