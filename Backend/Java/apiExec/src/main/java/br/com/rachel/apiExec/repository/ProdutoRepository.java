package br.com.rachel.apiExec.repository;

import br.com.rachel.apiExec.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
