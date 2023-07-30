package br.edu.unicesumar;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ryan", LocalDate.of(2003, 2, 4), 20);
        Pessoa pessoa2 = new Pessoa("Maria", LocalDate.of(1985, 9, 20), 38);

        System.out.println("Informações da Pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Data de Nascimento: " + pessoa1.getDataNascimento());
        System.out.println("Idade: " + pessoa1.getIdade() + " anos");

        System.out.println("\nInformações da Pessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Data de Nascimento: " + pessoa2.getDataNascimento());
        System.out.println("Idade: " + pessoa2.getIdade() + " anos");
    }
}
