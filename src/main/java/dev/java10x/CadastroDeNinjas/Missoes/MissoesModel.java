package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;

import java.util.List;
@Entity//Entity só pode ser usado a cima da declaração da classe
@Table(name = "tb_missoes") //O table só pode ser usado acima da declaração da classe

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ele pega a coluna do id e gera automatico o id
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes") //o mappedBy é uma relação de uma tabela para outra por chave estrangeira) // uma missoes vou poder ter varios ninjas --> 1 -> N
    private List<NinjaModel> ninjas;


    public MissoesModel() {
    }

    public MissoesModel(Long id, String nome, String dificuldade) {
        this.id = id;
        this.nome= nome;
        this.dificuldade = dificuldade;

    }

    public MissoesModel(List<NinjaModel> ninjas) {
        this.ninjas = ninjas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<NinjaModel> getNinja() {
        return ninjas;
    }

    public void setNinja(List<NinjaModel> ninja) {
        this.ninjas = ninja;
    }
}
