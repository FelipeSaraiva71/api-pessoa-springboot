package com.pessoa.pessoa.service;

import com.pessoa.pessoa.model.Pessoa;
import com.pessoa.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
@Autowired
    private PessoaRepository repository;

public Pessoa salvar(Pessoa pessoa){
    return repository.save(pessoa);
}

public List<Pessoa> listarTodas(){
    return repository.findAll();
}

public void deletar(Long id){
    repository.deleteById(id);
}

}
