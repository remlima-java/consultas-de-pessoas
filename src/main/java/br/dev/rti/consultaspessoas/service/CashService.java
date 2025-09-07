package br.dev.rti.consultaspessoas.service;

import br.dev.rti.consultaspessoas.entity.Cash;
import br.dev.rti.consultaspessoas.repository.CashRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
@AllArgsConstructor
public class CashService {

    private CashRepository cashRepository;

    public void pay(BigDecimal amount) {
        Cash cashed = new Cash();
        this.cashRepository.findAll().forEach(cash -> {
          cashed.setPayMent(cash.getPayMent().add(amount));
        });

        log.info("Iniciando pagamento");
        this.cashRepository.save(cashed);
        log.info("Pagamento realizado com sucesso");


    }
}
