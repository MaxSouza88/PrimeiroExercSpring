package com.Produtos.primeiroProjeto.controller;

import com.Produtos.primeiroProjeto.model.ProdutosModel;
import com.Produtos.primeiroProjeto.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService;

    @GetMapping(path = "/produtos")
    public List<ProdutosModel> buscarTodosProdutos() {
        return produtosService.buscarTodos();
    }

    @GetMapping(path = "/produtos/{codigo}")
    public Optional<ProdutosModel> buscarPorId(@PathVariable Long codigo) {
        return produtosService.buscarId(codigo);
    }

    @PostMapping(path = "/produtos")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutosModel cadastrarProdutos(@RequestBody ProdutosModel produtosModel) {
        return produtosService.cadastrar(produtosModel);
    }

    @PutMapping(path = "/produtos/{codigo}")
    public ProdutosModel alterarProduto(@RequestBody ProdutosModel produtosModel) {
        return produtosService.alterar(produtosModel);
    }

    @DeleteMapping(path = "/produtos/{codigo}")
    public void deletarProdutos(@PathVariable Long codigo) {
        produtosService.deletar(codigo);
    }

}
