package br.imd.ufrn.dominio;

public class Elefante extends Animal{
	private int tamanhoTromba;

	
	
	public Elefante() {
		
	}
	
	public boolean precisaConsulta() {
		boolean res = false;
		int idade = getIdade();
		if(idade >=  7) {
			res= true;
		}
		return res;
	}
	
	
	public int getTamanhoTromba() {
		return tamanhoTromba;
	}

	public void setTamanhoTromba(int tamanhoTromba) {
		this.tamanhoTromba = tamanhoTromba;
	}
	
	public void comer () {
		qtdComida += peso*0.15;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + tamanhoTromba;
	}
}
