package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

@Entity//essa anotação eu mostro para o java que irei criar uma tabela no banco de dados com o nome de cada atributo
@Table(name = "tb_cadastro") //com essa anotação eu consigo criar uma tabela para essa classe
//JPA = Java Persistence API
public class NinjaModel {

    @Id// para falar que o que ta embaixo dele vai ser um id
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //anotação para sequenciar os id
    private int id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
