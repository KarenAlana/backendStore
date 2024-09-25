package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int preco;
    private int ultimopreco;
    private int estrelas;
    private String produto;
    private String imagem;
    private String descricao;
    private String categoria;

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getUltimopreco() {
        return ultimopreco;
    }

    public void setUltimopreco(int ultimopreco) {
        this.ultimopreco = ultimopreco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}

// CREATE TABLE produtos (
// id INT AUTO_INCREMENT PRIMARY KEY,
// preco INT NOT NULL,
// ultimopreco INT NOT NULL,
// estrelas INT NOT NULL,

// produto VARCHAR(255) NOT NULL,

// imagem VARCHAR(255),
// descricao TEXT,

// categoria VARCHAR(255)
// );
