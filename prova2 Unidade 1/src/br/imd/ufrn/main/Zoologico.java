package br.imd.ufrn.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

import br.imd.ufrn.dominio.Animal;
import br.imd.ufrn.dominio.Elefante;
import br.imd.ufrn.dominio.Estoque;
import br.imd.ufrn.dominio.Girafa;
import br.imd.ufrn.dominio.Tigre;

public class Zoologico {

	public static void main(String[] args) {
		
		Estoque armazem = new Estoque();
		
		
		Animal girafa1 = new Girafa();
		girafa1.setPeso(500);
		girafa1.setNome("girafa 1");
		Animal tigre1 = new Tigre();
		tigre1.setPeso(600);
		tigre1.setNome("tigre1");
		Animal elefante1 = new Elefante();
		elefante1.setPeso(2000);
		elefante1.setNome("elefante1");
		Animal melman = new Girafa();
		melman.setPeso(400);
		melman.setNome("melman");
		Animal alex = new Tigre();
		alex.setPeso(700);
		alex.setNome("alex");
		Animal gloria = new Elefante();
		gloria.setPeso(700);
		gloria.setNome("gloria");
		
		armazem.addAnimal(girafa1);
		armazem.addAnimal(gloria);
		armazem.addAnimal(alex);
		armazem.addAnimal(melman);
		armazem.addAnimal(elefante1);
		armazem.addAnimal(tigre1);
		
		elefante1.comer();
		gloria.comer();
		girafa1.comer();
		melman.comer();
		alex.comer();
		tigre1.comer();
		
		armazem.qtdAlimentos();
		
		
		
		
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 13);
		dataNascimento.set(Calendar.MONTH, 9);
		dataNascimento.set(Calendar.YEAR, 1999);
		girafa1.setDataNascimento(dataNascimento.getTime());
		
		Calendar dataNascimento2 = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 13);
		dataNascimento.set(Calendar.MONTH, 9);
		dataNascimento.set(Calendar.YEAR, 2020);
		tigre1.setDataNascimento(dataNascimento.getTime());
		
		Calendar dataNascimento3 = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 13);
		dataNascimento.set(Calendar.MONTH, 9);
		dataNascimento.set(Calendar.YEAR, 2005);
		elefante1.setDataNascimento(dataNascimento.getTime());
		
		Calendar dataNascimento4 = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 13);
		dataNascimento.set(Calendar.MONTH, 9);
		dataNascimento.set(Calendar.YEAR, 2007);
		melman.setDataNascimento(dataNascimento.getTime());
		
		Calendar dataNascimento5 = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 13);
		dataNascimento.set(Calendar.MONTH, 9);
		dataNascimento.set(Calendar.YEAR, 2009);
		alex.setDataNascimento(dataNascimento.getTime());
		
		Calendar dataNascimento6 = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 13);
		dataNascimento.set(Calendar.MONTH, 9);
		dataNascimento.set(Calendar.YEAR, 2011);
		gloria.setDataNascimento(dataNascimento.getTime());
		
		
		girafa1.setIdade(girafa1.calculaIdade(girafa1));
		melman.setIdade(melman.calculaIdade(melman));
		alex.setIdade(alex.calculaIdade(alex));
		gloria.setIdade(gloria.calculaIdade(gloria));
		tigre1.setIdade(tigre1.calculaIdade(tigre1));
		elefante1.setIdade(elefante1.calculaIdade(elefante1));
		
		
		
		System.out.println(girafa1.getIdade());
		armazem.precisaConsulta();
		
		armazem.imprimeIdadesOrdenadas();
	}

}
