package com.lucasf.minhasfinancas.repositorys;

import com.lucasf.minhasfinancas.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
