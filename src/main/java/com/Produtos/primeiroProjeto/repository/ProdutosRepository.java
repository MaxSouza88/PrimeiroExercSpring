package com.Produtos.primeiroProjeto.repository;

import com.Produtos.primeiroProjeto.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {

}
