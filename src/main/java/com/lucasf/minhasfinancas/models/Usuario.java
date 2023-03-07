package com.lucasf.minhasfinancas.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String senha;
}
