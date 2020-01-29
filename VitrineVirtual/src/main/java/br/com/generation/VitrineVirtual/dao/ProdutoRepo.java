package br.com.generation.VitrineVirtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.generation.VitrineVirtual.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{
	// Aqui pode vim outros metodos
}
