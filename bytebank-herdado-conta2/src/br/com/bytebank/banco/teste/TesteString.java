package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";
		String nome2 = "";
		String nome3 = " "; // espaço é um caractere - metodo trim retira
		char a = 'W';
		
		nome.toString();
		
		System.out.println(nome.length());
		System.out.println(nome.isEmpty());
		System.out.println(nome2.isEmpty()); // isEmpty retorna true ou false (vazio ou não)
		
		System.out.println("Contem u : " + nome.contains("u"));
		
		String nome4 = nome3.trim(); // remover o espaço da variavel nome3
		System.out.println("Nome4: " + nome4.isEmpty()); // testando a vriavel nome3 para ver se retirou o espaco
		
		for (int i = 0; i< nome.length();i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nome);
		
		String s1 = nome.toLowerCase();
		System.out.println(s1);
	
		String s2 = nome.toUpperCase();
		System.out.println(s2);
		
		String r1 = nome.replace(" ", "-");
		System.out.println("R1 " + r1);
		
		System.out.println(nome.charAt(1)); //inicia do 0
		
		int pos = nome.indexOf(r1); //inicia do 0
		System.out.println(a);
		
		String s3 = nome.substring(1,3);
		System.out.println(s3);
		
		System.out.println(nome);
		
		
		
	}
}
