package com.h2pessoa.banco.entitites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name= "tb_pessoa")
	public class Pessoa {
	
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String nome;
		
		@Column(name= "data_de_nascimento")
		private String dataDeNascimento;
	
		
		public Pessoa(Long id, String nome, String dataDeNascimento) {
			this.id = id;
			this.nome = nome;
			this.dataDeNascimento = dataDeNascimento;
		}

	
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDataDeNascimento() {
			return dataDeNascimento;
		}

		public void setDataDeNascimento(String dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}
}