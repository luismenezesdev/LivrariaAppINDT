package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.*;
import com.example.demo.repository.LivroRepository;

import java.util.List;
import java.util.Optional;

import javax.persistence.Convert;

@CrossOrigin("*")
@RestController
@RequestMapping("/livro")
public class LivroService {

	@Autowired
	private LivroRepository _repoLivro;	

	/**
	 * CONSULTAR TODOS
	 */

	@RequestMapping("/listar")
	public List<LivroModel> consultar(){
//		try { 
//			return new ResponseModel(1,"consultar!");
// 
//		}catch(Exception e) {
// 
//			return new ResponseModel(0,e.getMessage());			
//		}
		
		List<LivroModel> lista =  this._repoLivro.findAll(); 
		
		return lista;
	}

	/**
	 * ATUALIZAR O REGISTRO
	 */

	@PutMapping 
	public @ResponseBody ResponseModel atualizar(@RequestBody
			LivroModel livro){
		LivroModel registro = _repoLivro.findById(livro.IdLivro).get();

		if (registro.IdLivro == null) {
			return new ResponseModel(0,"Não há livro cadastrado com esse código!");
		}
		else {
			try {

				this._repoLivro.save(livro);

				return new ResponseModel(1,"Registro atualizado com sucesso!");

			}catch(Exception e) {

				return new ResponseModel(0,e.getMessage()); } 
			}
		}
		

	/**
	 * SALVAR UM NOVO REGISTRO
	 */

	@PostMapping 
	public @ResponseBody ResponseModel salvar(@RequestBody
			LivroModel livro){


		try {

			
			 this._repoLivro.save(livro);
			 
			return new ResponseModel(1,"Registro salvo com sucesso!");

		}catch(Exception e) {

			return new ResponseModel(0,e.getMessage()); } 
	}
	
	/***
	 * EXCLUIR UM REGISTRO
	 */
	@DeleteMapping("/{id}")
	public @ResponseBody ResponseModel excluir(@PathVariable Integer id) {

		LivroModel livroModel = _repoLivro.findById(id).get();

		try {

			_repoLivro.delete(livroModel);

			return new ResponseModel(1, "Registro excluido com sucesso!");

		} catch (Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}

}
