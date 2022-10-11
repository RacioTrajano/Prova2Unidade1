package br.imd.ufrn.dominio;

public class Tigre extends Animal{
	private String tipoTigre;

	public Tigre() {
		
	}
	
	public boolean precisaConsulta() {
		boolean res = false;
		int idade = getIdade();
		if(idade >=  3) {
			res= true;
		}
		return res;
	}
	public String getTipoTigre() {
		return tipoTigre;
	}

	public void setTipoTigre(String tipoTigre) {
		this.tipoTigre = tipoTigre;
	}
	
	public void comer() {
		qtdComida += peso*0.04;
	}
	@Override
	public String toString() {
		
		return super.toString() + tipoTigre;
	}
}
