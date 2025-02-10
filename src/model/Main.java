package model;

public class Main {

	public static void main(String[] args) {
		
		ListaEstatica a = new ListaEstatica();
		a.inserir(1);
		a.inserir(2);
		a.inserir(3);
		a.inserir(4);
		a.inserir(5);
		a.inserir(6);
		a.inserir(7);
		a.inserir(8);
		a.inserir(9);
		a.inserir(10);
	
		
		a.exibir();
		System.out.println("----------------------");
		
		System.out.println(a.toString());
		System.out.println("----------------------");
		a.retirar(10);
		System.out.println(a.toString());
		
		a.retirar(3);
		System.out.println(a.toString());
		
		
		
		

		
	}

}
