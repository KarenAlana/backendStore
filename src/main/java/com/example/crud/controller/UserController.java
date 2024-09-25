package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Produtos;
import com.example.crud.repositorio.Repositorio;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {
    @Autowired
    private Repositorio acao; 
    // Verificar conexão

    @GetMapping("/status")
    public String status() {
        return "Status OK";
    }
    // Verificar cadastrar Produtos
    @PostMapping("/cadastrar")
    public Produtos postMethodName(@RequestBody Produtos obj) {
        return acao.save(obj);
    }
    // Retornar produtos
    @GetMapping("/produtos")
    public Iterable<Produtos> produtos() {
        return acao.findAll();
    }
 

     //EDITAR 
    @PutMapping("/editar")
    public Produtos editar(@RequestBody Produtos obj) {
        return acao.save(obj);
    } // Pesquisar Produto por ID no corpo da requisição

    @GetMapping("/filtrarProduto")
    public List<Produtos> produtoContem() {
        return acao.findByProdutoContaining("pro");
    }
    @GetMapping("/filtrarCategoria")
    public List<Produtos> categoriaContem() {
        return acao.findByCategoriaContaining("mou");
    }

    // DELETE usando o corpo da requisição
    @DeleteMapping("/deletar")
    public void deletar(@RequestBody Produtos obj) {
        acao.delete(obj);
    }
   
    // // GET EM USER COM ID DA URL(PARAMETRO)
    
    @GetMapping("/produtos/{id}")
    public Produtos selecionarPeloCodigo(@PathVariable int id) {
        return acao.findById(id);
    }
    
    @GetMapping("/categoria/{categoria}")
    public List<Produtos> selecionarPelaCategoria(@PathVariable String categoria) {
        return acao.findByCategoriaContaining(categoria);
    }
    
    // DELETE EM USER COM ID DA URL(PARAMETRO)
    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        Produtos obj = selecionarPeloCodigo(id);
        acao.delete(obj);
    }
    
 
}
