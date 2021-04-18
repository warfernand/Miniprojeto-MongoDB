package com.ifpb.modelo;

public class Cliente {

    private int id;
    private String nome;
    private String valorConsumo;

    public Cliente() {
    }

    public Cliente(int id, String nome, String valorConsumo) {
        this.id = id;
        this.nome = nome;
        this.valorConsumo = valorConsumo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValorConsumo() {
        return valorConsumo;
    }

    public void setValorConsumo(String valorConsumo) {
        this.valorConsumo = valorConsumo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor='" + valorConsumo + '\'' +
                '}';
    }
}

