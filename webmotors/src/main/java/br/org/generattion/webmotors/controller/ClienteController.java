package br.org.generattion.webmotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generattion.webmotors.bd.BDCliente;
import br.org.generattion.webmotors.model.Cliente;

@RestController
public class ClienteController {

	/*
	 * @GetMapping("/cliente/teste") public Cliente testeCliente() { Cliente c = new
	 * Cliente(); c.setId(1234); c.setNome("Debora");
	 * c.setEmail("debora123@gmail.com"); c.setCpf("000.000.000-00");
	 * c.setTelefone(" 00000-0000"); c.setDataNas("00/00/0000");
	 * 
	 * return c; }
	 */
	
	//"criei meu banco de dados 
	private BDCliente bd = new BDCliente();
	
	@PostMapping("/cliente/novo") 
		public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente cliente){
			bd.gravar(cliente);
			return ResponseEntity.ok(cliente);
		}
	
	 @GetMapping("/cliente/{id}") 
	 public ResponseEntity<Cliente> getCliente(@PathVariable int id){
		 Cliente cli = bd.buscar(id);
		 if (cli != null) {
			 return ResponseEntity.ok(cli);
		 }
		 else {
			 return ResponseEntity.notFound().build();
		 }
		 
	  }
	 
	
	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<Cliente>> getTodos(){
		return ResponseEntity.ok(bd.buscarTodos());
	}
}
