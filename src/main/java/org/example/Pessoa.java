package org.example;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Memento criarMemento() {
        return new Memento(nome, idade);
    }

    public void restaurarMemento(Memento memento) {
        this.nome = memento.getNome();
        this.idade = memento.getIdade();
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
}
