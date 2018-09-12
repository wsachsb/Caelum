package br.com.bytebank.banco.test.util;

import org.junit.jupiter.api.Test;

/**
* Trabalho! Automata Amazon Questão 1 de 2 Casos de casos de teste de problemas Saída A linguagem de programação atual selecionada é Java. Nós enfatizamos a submissão de um código totalmente funcional sobre código parcialmente correto, mas eficiente. Depois de enviado, você não pode rever esse problema novamente. A versão do JDK em uso é 1.8.
* Uma colônia de oito casas, representada como células, é disposta em linha reta. 
* Cada dia, cada célula compete com suas células adjacentes (vizinhos). 
* Um valor inteiro de 1 representa uma célula ativa e o valor de O representa uma célula inativa. 
* Se ambos os vizinhos estiverem ativos ou inativos, a célula se tornará inativa no dia seguinte; 
* caso contrário, torna-se ativo no dia seguinte. 
* As duas células nas extremidades têm uma única célula adjacente, de modo que a outra célula adjacente pode ser considerada inativa. Mesmo depois de atualizar o estado da célula, seu estado anterior é considerado para atualizar o estado de outras células. As informações da célula de todas as células devem ser atualizadas simultaneamente. 
* Escreva um algoritmo para gerar o estado das células após um determinado número de dias.
* Entrada A entrada para a função / método consiste em dois estados de argumentos, uma lista de números inteiros representando o estado atual de ceils. dias, um inteiro representando o número de dias. 
* Saída retorna uma lista de inteiros representando o estado das células após o número de dias especificado.
* @author wbarros
*
*/


public class TesteArrayListaIntAmazon1 {
	
	
	public void test(int[] inteiro, int day) {

		int[] novoStado = new int[inteiro.length];
		
		for (int j=1; j<=day; j++) {
			System.out.println("-------------------");
			System.out.println("Dia : " + j);
			System.out.println("-------------------");
			for(int ii=0; ii<inteiro.length;ii++) {
				System.out.println("Endatra Valor Inteiro inicial" + ", posicao : " + ii+ " valor: " + inteiro[ii]); 
			}
     
			System.out.println("-------------------");
     
			inteiro = test(inteiro, novoStado);
		
		}
		System.out.println("-------------------");
	} 
	
	public int[] test(int[] inteiro, int[] novoStado) {
		for(int i = 0; i <inteiro.length; i++) {
			if(i ==0) { // se for o primeiro do array
				 test(inteiro[i+1], novoStado, i, 0);
				 continue;
			} 
			if (i == inteiro.length-1) { //ultimo do array
				test(inteiro[i-1], novoStado, i, 0);
			 	continue;
	       	 		
			} 
			test(inteiro[i-1], novoStado, i,  inteiro[i+1]); 
		} 
		return novoStado.clone();
		
	}
	
	public void test(int inteiro, int[] novoStado, int i, int compare) {
		novoStado[i] = 1;
		if(inteiro == compare) {
 			novoStado[i] = 0;
 		}
		System.out.println("Saida - Valor StadoNovo" + ", posicao : " + i+ " valor: " + novoStado[i]);	 
	}

	
	@Test
	public void execute() {
		
      test(new int[]{1,0,0,0,0,1,0,0}, 1);
      
	  test(new int[]{1,1,1,0,1,1,1,1}, 2);
      //test(new int[]{1,0,1,0,1,0,0,1}, 1);
 
	}
	
}


