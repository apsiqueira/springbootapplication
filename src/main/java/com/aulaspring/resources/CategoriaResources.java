package com.aulaspring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspring.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias") // end point que representa categoria
public class CategoriaResources {

	@RequestMapping(method = RequestMethod.GET) // requisição http usando um metodo get
	public List<Categoria> listar() {//metodo listar do tipo Lista(generics)

		Categoria cat1 = new Categoria(1, "informatica");//adicionado dados de teste
		Categoria cat2 = new Categoria(2, "Escritorio");//adicionado dados de teste

		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);

		return lista;

	}

}
