package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.Controller.Services.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String dificuldade;

    private NinjaModel ninja;

    // @ManyToOne - Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoesModel" )
    private List<NinjaModel> ninjas;




}
