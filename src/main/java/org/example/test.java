package org.example;

import org.example.Caretaker;
import org.example.Memento;
import org.example.Pessoa;

public class test {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        Caretaker caretaker = new Caretaker();

        System.out.println("Estado inicial: " + pessoa);

        pessoa.setNome("José");
        pessoa.setIdade(30);

        caretaker.adicionarMemento(pessoa.criarMemento());

        pessoa.setNome("Maria");
        pessoa.setIdade(35);

        Memento ultimoMemento = caretaker.getUltimoMemento();
        if (ultimoMemento != null) {
            pessoa.restaurarMemento(ultimoMemento);
        }

        System.out.println("Estado final: " + pessoa);
    }
}

