package com.example.crud.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.crud.model.Produtos;

@Repository
public interface Repositorio extends CrudRepository<Produtos, Integer> {
    // Apagar
    Produtos findById(int id);
    List<Produtos> findByProdutoContaining(String parametrotermo);
    List<Produtos> findByCategoriaContaining(String parametrotermo);
}
