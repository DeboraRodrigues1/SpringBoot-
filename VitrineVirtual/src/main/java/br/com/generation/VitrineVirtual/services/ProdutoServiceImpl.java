package br.com.generation.VitrineVirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.generation.VitrineVirtual.dao.ProdutoRepo;
import br.com.generation.VitrineVirtual.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService{
	
	@Autowired					//Declaramos a intedace DAO que criamos
	private ProdutoRepo repo;	//É a anotação AutoWired busca uma implementação dentro do JPA
	
	@Override
	public List<Produto> recuperarTodos(){
		// isso coresponde a um
		//select * from tblproduto
		//		inner join tbldepartamento
		//		on tblproduto.depto_id = departamento.id
		return (List<Produto>)repo.findAll();
	}
	
	@Override
	public Produto recuperarPorId(int id) {
		//TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}
}

