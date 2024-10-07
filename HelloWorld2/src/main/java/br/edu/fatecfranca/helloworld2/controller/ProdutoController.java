package br.edu.fatecfranca.helloworld2.controller;

import br.edu.fatecfranca.helloworld2.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProdutoController {


    //  Simular um banco de dados contendo os produtos
    private static final Map<Long, Produto> produtos = new HashMap<>();
    static{
        produtos.put(1l, new Produto(1l, "Notebook", 3500));
        produtos.put(2l, new Produto(2l, "Celular", 2000));
        produtos.put(3l, new Produto(3l, "Tablet", 1500));
    }

    @GetMapping("/produto/{id}")
    public Produto findbyId(@PathVariable Long id){
        Produto produto = produtos.get(id);
        if(produto != null){
            return produto;
        }
        else{
            return new Produto(0l, "Produto não encontrado", 0);
        }
    }

    @GetMapping("/produto")
    public Map<Long, Produto> findAll(){
        return produtos;
    }

    @PostMapping("/produto")
    public Produto add(@RequestBody Produto produto){
        produtos.put(produto.getId(), produto);
        return produto;
    }
    @DeleteMapping("/produto/{id}")
    public String delete(@PathVariable Long id){
        Produto produto = produtos.remove(id);
        if (produto != null){
            return "Removido com sucesso!";
        }
        else{
            return "Produto não encontrado";
        }
    }

    @PutMapping("/produto/{id}")
    public String update(@PathVariable Long id, @RequestBody Produto produto){
        Produto produtoExistente = produtos.get(id);
        if (produtoExistente != null){
            produtoExistente.setNome(produto.getNome());
            produtoExistente.setPreco(produto.getPreco());
            produtos.put(id, produtoExistente);
            return "Produto atualizado com sucesso";
        }
        else{
            return "Produto não existe";
        }
    }
}

