package br.dev.rti.consultaspessoas.repository;

import br.dev.rti.consultaspessoas.entity.Cash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashRepository extends JpaRepository<Cash, Long> {
}
