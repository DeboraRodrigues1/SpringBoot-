package br.com.generation.VitrineVirtual.services;

import java.util.List;

import br.com.generation.VitrineVirtual.model.Produto;

public interface IProdutoService{
	public List<Produto> recuperarTodos();
	public Produto recuperarPorId(int id);

}
