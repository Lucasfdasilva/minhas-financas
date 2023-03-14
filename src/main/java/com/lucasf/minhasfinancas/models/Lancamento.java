package com.lucasf.minhasfinancas.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Data
public class Lancamento {
    private Long id;
    private Integer mes;
    private Integer ano;
    private Usuario usuario;

    private BigDecimal valor;
    private LocalDate dataCadastro;

}
