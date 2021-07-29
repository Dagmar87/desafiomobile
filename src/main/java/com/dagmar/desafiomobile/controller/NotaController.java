package com.dagmar.desafiomobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dagmar.desafiomobile.model.Nota;
import com.dagmar.desafiomobile.repository.NotaRepository;

@RestController
@RequestMapping({ "/nota" })
public class NotaController {
	
	@Autowired
	private NotaRepository rep;
	
	// Consultar uma lista de todas notas cadastradas -
	// http://localhost:8077/nota
	@GetMapping
	public List findAll(){
		
		return rep.findAll();
		
	}
	
	// Consultar uma determinada nota cadastrada partir do id desta -
	// http://localhost:8080/nota/{id}
	@GetMapping(value = "{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		
		return rep.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
		
	}
	
	// Criar um novo cadastro de uma nota -
	// http://localhost:8080/nota
	@PostMapping
	public Nota create(@RequestBody Nota nota){
		
		return rep.save(nota);
		
	}
	
	// Atualizar os dados de uma nota cadastrada -
	// http://localhost:8080/nota/{id}
	@PutMapping(value = "{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Nota nota){
		
		return rep.findById(id).map(r -> {
			r.setTitulo(nota.getTitulo());
			r.setTexto(nota.getTexto());
			Nota update = rep.save(r);
			return ResponseEntity.ok().body(update);
		}).orElse(ResponseEntity.notFound().build());
		
	}
	
	// Deletar os dados da nota cadastrada -
	// http://localhost:8080/nota/{id}
	@DeleteMapping(path = "{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		
		return rep.findById(id).map(r -> {
			rep.deleteById(id);
			return ResponseEntity.ok().body("Deletado com Sucesso");
		}).orElse(ResponseEntity.notFound().build());
		
	}

}
