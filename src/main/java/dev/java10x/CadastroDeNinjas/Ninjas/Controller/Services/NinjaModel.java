package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Services;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// Entity ele transforma ema classe em uma entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastrob  ")
public class NinjaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String email;

    private int idade;

    private List<MissoesModel> missoes;

    //@ManyToMany - um ninja tem uma unica missão
    @ManyToMany
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoesModel;


    public NinjaModel() {
    }

    public NinjaModel(long id, String nome, String email, int idade, List<MissoesModel> missoes) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<MissoesModel> getMissoes() {
        return missoes;
    }

    public void setMissoes(List<MissoesModel> missoes) {
        this.missoes = missoes;
    }
}
