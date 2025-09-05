package com.pessoa.pessoa.repository;

import com.pessoa.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
