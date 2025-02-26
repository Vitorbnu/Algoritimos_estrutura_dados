package view;

import model.ListaEncadeada;

public class ListaEncadeadaMain {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		lista.inserir(6);
		lista.inserir(7);
		lista.inserir(8);
		
		
		System.out.println(lista.toString());
		
		lista.retirar(1);
		System.out.println(lista.toString());
		
		
		System.out.println(lista.estaVazia()); 
		
		
		
	}

}
