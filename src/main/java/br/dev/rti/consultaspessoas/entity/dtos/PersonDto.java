package br.dev.rti.consultaspessoas.entity.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

    private String name;

    private String cpf;

    @JsonProperty("payment")
    private BigDecimal payMent;
}
