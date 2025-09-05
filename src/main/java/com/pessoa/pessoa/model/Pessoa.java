package com.pessoa.pessoa.model;


import com.pessoa.pessoa.utils.Util;
import jakarta.persistence.*;

@Entity@Table (name = "pessoas")


public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nome;
    private String sobrenome;


    public Pessoa(){

    }

    public Pessoa (String nome, String sobrenome){

        this.nome = Util.validaNome(nome);
        this.sobrenome = Util.validaNome(sobrenome);

    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public  String getNome(){
        return this.nome;
    }

    public void setNome (String nome){
        this.nome = Util.validaNome(nome);
    }

    public String getSobrenome(){
        return  this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = Util.validaNome(sobrenome);
    }
}
