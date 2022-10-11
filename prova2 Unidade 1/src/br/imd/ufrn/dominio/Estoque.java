package br.imd.ufrn.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Estoque {
	
	private List<Animal> animais;
	private int qtdAlimento;
	
	public List<Animal> listarAnimais() {
			return animais;
		}

	public void addAnimal(Animal animal) {
		if(animais == null)
			animais = new ArrayList<Animal>();
		animais.add(animal);
	}
	
	public void qtdAlimentos() {
		
		int num1 = 0;
		int num2 = 0;
		
		
		for (Animal animal : animais) {
			if(animal instanceof Tigre ) {
				num1 += animal.getQtdComida();
			}
		}
		for (Animal animal : animais) {
			if(animal instanceof Girafa || animal instanceof Elefante) {
				num2 += animal.getQtdComida();
			}
		}
		System.err.println("Qtd comida carnivoros: " + num1);
		System.err.println("Qtd comida vegetarianos: " + num2);
		
	}
	
	public int getQtdAlimento() {
		return qtdAlimento;
	}

	public void setQtdAlimento(int qtdAlimento) {
		this.qtdAlimento = qtdAlimento;
	}

	public void imprimeJaulas() {
		for (Animal animal: animais) {
			System.out.println(animal);
		}
	}
	
	public void precisaConsulta() {
		System.err.println("Animais que precisam de consulta: ");
		for (Animal animal: animais) {
			if(animal.precisaConsulta() == true) {
				System.out.println(animal);
			}
		}
	}
	
	public void imprimeIdadesOrdenadas() {
		Collections.sort(animais);
		System.err.println("Idades ordenadas");
		for(Animal animal: animais) {
			System.out.println(animal);
		}
	}
	
	
}
