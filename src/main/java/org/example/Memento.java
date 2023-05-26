package org.example;
import java.util.ArrayList;
import java.util.List;


class Memento {
    private String nome;
    private int idade;

    public Memento(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}