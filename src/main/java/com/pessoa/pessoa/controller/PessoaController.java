package com.pessoa.pessoa.controller;

import com.pessoa.pessoa.model.Pessoa;
import com.pessoa.pessoa.repository.PessoaRepository;
import com.pessoa.pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {

@Autowired
private PessoaService pessoaService;

@PostMapping("/pessoas")
    public Pessoa criar(@RequestBody Pessoa pessoa){

    return pessoaService.salvar(pessoa);
}

@GetMapping("/pessoas")
    public List<Pessoa> listarTodas(){

    return pessoaService.listarTodas();
}

@DeleteMapping("/pessoas/{id}")
    public void deletar(@PathVariable Long id){

    pessoaService.deletar(id);
}

@PutMapping("/pessoas/{id}")
    public Pessoa atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa){
    pessoa.setId(id);

    return pessoaService.salvar(pessoa);
}
}
