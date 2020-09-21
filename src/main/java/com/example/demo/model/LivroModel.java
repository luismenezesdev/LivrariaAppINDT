package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class LivroModel {
	
	public LivroModel() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "l_id")
	public Integer IdLivro;
	
	@Column(name = "l_titulo")
	public String Titulo;
	
	@Column(name = "l_assunto")
	public String Assunto;
	
	@Column(name = "l_autor")
	public String Autor;
	
	@Column(name = "l_valor")
	public Float Valor;	
		
	public Integer getIdLivro() {
		return IdLivro;
	}
	public void setIdLivro(Integer IdLivro) {
		this.IdLivro = IdLivro;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}
	
	public String getAssunto() {
		return Assunto;
	}
	public void setAssunto(String Assunto) {
		this.Assunto = Assunto;
	}
	
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String Autor) {
		this.Autor = Autor;
	}
	
	public Float getValor() {
		return Valor;
	}
	public void setValor(Float Valor) {
		this.Valor = Valor;
	}
	
}
