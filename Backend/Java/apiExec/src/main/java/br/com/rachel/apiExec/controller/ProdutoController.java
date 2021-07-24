package br.com.rachel.apiExec.controller;

import br.com.rachel.apiExec.model.Produto;
import br.com.rachel.apiExec.repository.ProdutoRepository;
import com.github.fge.jsonpatch.JsonPatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Produto> list(){
        ArrayList<Produto> all = (ArrayList<Produto>) produtoRepository.findAll();

        return all;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Produto addProduto(@RequestBody Produto prd){
       return produtoRepository.save(prd);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Produto listById(@PathVariable("id") Integer id){
        Optional<Produto> produto = produtoRepository.findById(id);

        return produto.get();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeById(@PathVariable("id") Integer id){
        produtoRepository.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public Produto updateById(@PathVariable("id") Integer id, @RequestBody Produto prd){
        Optional<Produto> produto = produtoRepository.findById(id);

        return produto.get();
    }

}
