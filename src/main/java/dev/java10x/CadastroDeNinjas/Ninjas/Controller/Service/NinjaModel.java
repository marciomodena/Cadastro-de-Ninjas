package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity//essa anotação eu mostro para o java que irei criar uma tabela no banco de dados com o nome de cada atributo
@Table(name = "tb_cadastro") //com essa anotação eu consigo criar uma tabela para essa classe
@NoArgsConstructor//Lombok criando construtor vazio
@AllArgsConstructor//Lombok criando construtor cheio
@Data // Lombok que cria getters e setters
//JPA = Java Persistence API
public class NinjaModel {

    @Id// para falar que o que ta embaixo dele vai ser um id
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //anotação para sequenciar os id
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true) // anotação para dados que são unicos no database
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "img_url")
    private String imgUrl;

    //No ManyToOne preciso juntar as colunas do mappedBy do OneToMany usando o JoinColumn
    @JoinColumn(name = "missoes_id") // missoes_id é o foreign key
    @ManyToOne //um ninja só podera ter uma missão - 1 --> 1
    private MissoesModel missoes;



}
