package controls;

import exceptions.Estoque_prodt_nao_encontrado_Exception;
import models.Produto;

import java.util.HashMap;
import java.util.Map;

public class Ge_estoque {

        private Map<Integer, Produto> produtosEstoque = new HashMap<>();

    public Map<Integer, Produto> todoEstoque() {
        return produtosEstoque;
    }

    public void addProdtEstoque(Integer id_prodt, Produto produto) {
        try {
            this.produtosEstoque.put(id_prodt, produto);
            System.out.println(produtosEstoque);
        } catch (NullPointerException e) {
            System.out.println("Não encontrei um produto para adicionar");
        }
    }

    public Produto buscaProdtEstoque(Integer id_prodt) {
        Produto produtoBuscado = this.produtosEstoque.get(id_prodt);
        if (produtoBuscado == null){
            throw new Estoque_prodt_nao_encontrado_Exception();
        }
        return produtoBuscado;
    }
}
