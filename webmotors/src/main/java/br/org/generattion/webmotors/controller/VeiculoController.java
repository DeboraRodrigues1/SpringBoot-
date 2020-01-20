package br.org.generattion.webmotors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generattion.webmotors.model.Veiculo;

@RestController
public class VeiculoController {

	@GetMapping("/veiculo/teste")
	public Veiculo testeVeiculo() {
        Veiculo v = new Veiculo();
		v.setId(1234);
		v.setMarca("Volkis");
		v.setModelo("Fusca");
		v.setAno(1978);
		v.setCor("Azul Geladeira da vó");
		v.setPreco(115800);
		v.setTipo("esportivo");
		v.setDetalhes("veiculo impecavel. " 
			+ "Motor Porsche Cayenne turbo, "
			+ "acabamento em couro caramelo. "
			+ "Trio eletrico, multimidia com navegação automatica, "
			+ "rodas de 23 polegadas. "
			+ "Camera de Ré. "
			+ "Serve café expresso (pó de café não incluso)");
		
		return v;	
		
	}
}
