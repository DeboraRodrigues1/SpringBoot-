package br.com.generation.Token.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.Token.model.Produto;
import br.com.generation.Token.security.Autenticador;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	
	@GetMapping("/Usuario")
	public ResponseEntity<ArrayList<Produto>> getAllAlunos(@RequestParam String token){
		if (Autenticador.isValid(token)) {
			/* este trecho é simulando uma consulta ao banco de dados */
			ArrayList<Produto> lista = new ArrayList<Produto>();
			for (int i=0;i<20;i++) {
				Produto a = new Produto();
				a.setCodigo((i+1)*100);
				a.setTitulo("Aluno "+(i+1));
				a.setDetalhes("91111-00"+(i+1));
				a.setPreco("Preco = "+(i+1));

				
				lista.add(a);
			}
			return ResponseEntity.ok(lista);
		}
		else {
			return ResponseEntity.status(403).build();
		}
		
	}
	

}
