package br.dev.rti.consultaspessoas.repository;

import br.dev.rti.consultaspessoas.entity.Cash;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashRepository extends CrudRepository<Cash, Long> {
}
