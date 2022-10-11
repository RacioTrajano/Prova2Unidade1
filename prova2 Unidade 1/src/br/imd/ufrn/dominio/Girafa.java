package br.imd.ufrn.dominio;

public class Girafa extends Animal{
	private int tamanhoLingua;

	public Girafa() {
		
	}
	
	public boolean precisaConsulta() {
		boolean res = false;
		int idade = getIdade();
		if(idade >=  5) {
			res= true;
		}
		return res;
	}
	public int getTamanhoLingua() {
		return tamanhoLingua;
	}

	public void setTamanhoLingua(int tamanhoLingua) {
		this.tamanhoLingua = tamanhoLingua;
	}
	
	public void comer() {
		qtdComida += peso*0.1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + tamanhoLingua;
	}
}
