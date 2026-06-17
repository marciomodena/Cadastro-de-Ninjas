package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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

    //No ManyToOne preciso juntar as colunas do mappedBy do OneToMany usando o JoinColumn
    @JoinColumn(name = "missoes_id") // missoes_id é o foreign key
    @ManyToOne //um ninja só podera ter uma missão - 1 --> 1
    private MissoesModel missoes;

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
