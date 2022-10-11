package br.imd.ufrn.dominio;

import java.util.Calendar;
import java.util.Date;


public class Animal implements Comparable<Animal> {
	protected String nome;
	protected Date dataNascimento;
	protected int peso;
	protected boolean alimentado = false;
	protected String alimentacao;
	protected int qtdComida;
	protected int idade;
	
	
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Animal() {
		
	}
	public void comer() {
		
	}
	
	public boolean precisaConsulta() {
		return true;
	}
	
	public int getQtdComida() {
		return qtdComida;
	}
	public void setQtdComida(int qtdComida) {
		this.qtdComida = qtdComida;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean isAlimentado() {
		return alimentado;
	}
	public void setAlimentado(boolean alimentado) {
		this.alimentado = alimentado;
	}
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	public int calculaIdade(Animal animal) {
		

		    Calendar dataNascimento = Calendar.getInstance();  
		    dataNascimento.setTime(getDataNascimento()); 
		    Calendar hoje = Calendar.getInstance();  

		    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

		    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
		      idade--;  
		    } 
		    else 
		    { 
		        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
		            idade--; 
		        }
		    }

		    return idade;
		
	}
	
	
	/**
	 * Ordenamento de idade
	 */
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome: " +nome + " idade: " +idade + " peso:  " + peso + "- " + "alimentação: " + alimentacao  ;
	}
	@Override
	public int compareTo(Animal outroAnimal) {
		if(this.getIdade() < outroAnimal.getIdade()) {
			return -1;
		}
		else if (this.getIdade() > outroAnimal.getIdade()) {
			return 1;
		}
		return 0;
	}
}
