package view;

import model.ListaDuplaEncadeada;

public class ListaDuplaEncadeadaMain {

	public static void main(String[] args) {
		ListaDuplaEncadeada lista = new ListaDuplaEncadeada();
		
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		lista.inserir(6);
		lista.inserir(7);
		lista.inserir(8);
		
		
		System.out.println(lista.toString());
		lista.exibirOrdemInversa();
		System.out.println(lista.toString());
		lista.retirar(1);
		System.out.println(lista.toString());
		
		
		
		
		lista.liberar();
		System.out.println(lista.toString());

	}

}
