package br.com.bytebank.banco.test.util;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inteiro = new int[]{1,0,0,0,0,1,0,0};
		
	 for(int ii=0; ii<inteiro.length;ii++) {
    	 System.out.println("Valor Stado inicial" + ", posicao : " + ii+ " valor: " + inteiro[ii]); 
     }
     
     System.out.println("-------------------");
     
     int[] novoStado = new int[inteiro.length];

     System.out.println("tamanho do inteiro: " + inteiro.length);
     
	 for(int i = 0; i <inteiro.length; i++) {
		 
		 switch (inteiro[i]) {
		 	case 1 : i =0;
		 		if(inteiro[i+1] == 0) {
		 			System.out.println("entrou if posicao 0 == 0");
		 			novoStado[i] = 0;
		 		}else {
		 			System.out.println("entrou else posicao 1 != 0");
		 			novoStado[i] = 1;
		 		}
		 	
		 	case 2 : i = inteiro.length-1;
		 	if(inteiro[i-1] == 0) {
		 		System.out.println("entrou if ultima posicao ==0");
		 		novoStado[i] = 0;
		 	}else {
		 		System.out.println("entrou else ultima posicao !=0");
		 		novoStado[i] = 1;
       	 	}
		 		
		 	
		 case 3: 
			
			 System.out.println(i);
		 	if(inteiro[i-1] == inteiro[i+1]) {
	 			System.out.println("entrou if posicao 0 == 0");
	 			novoStado[i] = 99;
	 		}else {
	 			System.out.println("entrou else posicao 1 != 0");
	 			novoStado[i] = 98;
	 		}
			 
		 }

	 } //for regra
      
     System.out.println("-------------------");
     for(int j=0; j<novoStado.length;j++) {
    	 System.out.println("Valor StadoNovo" + ", posicao : " + j+ " valor: " + novoStado[j]); 
     	} // print result novoStado

	
	
	
	}



}
