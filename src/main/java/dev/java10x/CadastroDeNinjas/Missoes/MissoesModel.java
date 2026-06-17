package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity//Entity só pode ser usado a cima da declaração da classe
@Table(name = "tb_missoes") //O table só pode ser usado acima da declaração da classe
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ele pega a coluna do id e gera automatico o id
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes") //o mappedBy é uma relação de uma tabela para outra por chave estrangeira) // uma missoes vou poder ter varios ninjas --> 1 -> N
    private List<NinjaModel> ninjas;



}
