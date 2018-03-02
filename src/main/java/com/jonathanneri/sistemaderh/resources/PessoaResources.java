package com.jonathanneri.sistemaderh.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jonathanneri.sistemaderh.domain.Pessoa;

@RestController
@RequestMapping(value="/pessoa")
public class PessoaResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Pessoa> listar() {
		
		Pessoa pes1 = new Pessoa(1, "jonathan");
		Pessoa pes2 = new Pessoa(2, "TI");
				
		List<Pessoa> lista = new ArrayList<>();		
		lista.add(pes1);
		lista.add(pes2);
		
		return lista;
	}

}
