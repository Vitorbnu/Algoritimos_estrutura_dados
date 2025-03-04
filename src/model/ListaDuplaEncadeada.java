package model;

public class ListaDuplaEncadeada<T> {

	private NoListaDupla<T> primeiro;

	public ListaDuplaEncadeada() {
		primeiro = null;
	}

	public NoListaDupla<T> getPrimeiro() {
		return primeiro;
	}

	public void inserir(T valor) {
		NoListaDupla<T> novo = new NoListaDupla<T>();
		novo.setAnterior(null);
		novo.setInfo(valor);
		novo.setProximo(primeiro);

		if (primeiro != null) {
			primeiro.setAnterior(novo);
		}
		primeiro = novo;
	}

	public NoListaDupla<T> buscar(T valor) {
		NoListaDupla<T> p = primeiro;

		while (p != null) {
			if (p.getInfo() == valor) {
				return p;
			} else {
				p = p.getProximo();
			}
		}
		return null;
	}

	public void retirar(T valor) {
		NoListaDupla<T> p = buscar(valor);

		if (p != null) {
			if (p == primeiro) {
				primeiro = p.getProximo();
			} else {
				p.getAnterior().setAnterior(p.getProximo());
			}
		}
		if (p.getProximo() != null) {
			p.getProximo().setAnterior(p.getAnterior());
		}

	}

	public void exibirOrdemInversa() {
		NoListaDupla<T> atual = primeiro;
	    NoListaDupla<T> temp = null;

	    // Troca as referências "anterior" e "proximo" de cada nó
	    while (atual != null) {
	        temp = atual.getAnterior(); // Salva o nó anterior
	        atual.setAnterior(atual.getProximo()); // Troca "anterior" com "proximo"
	        atual.setProximo(temp); // Troca "proximo" com o nó anterior salvo
	        atual = atual.getAnterior(); // Avança para o próximo nó (que agora está em "anterior")
	    }

	    // Atualiza o ponteiro "primeiro" para o novo início da lista
	    if (temp != null) {
	        primeiro = temp.getAnterior();
	    }
	}

	public void liberar() {
		 NoListaDupla<T> p = primeiro;
		    while (p != null) {
		        NoListaDupla<T> proximo = p.getProximo(); // Salva a referência para o próximo nó
		        p.setAnterior(null); // Libera a referência para o nó anterior
		        p.setInfo(null); // Libera a informação do nó
		        p.setProximo(null); // Libera a referência para o próximo nó
		        p = proximo; // Move para o próximo nó
		    }
		    primeiro = null;
		
	}

	

	@Override
	public String toString() {
		String str = "";
		NoListaDupla<T> p = this.primeiro;
		while (p != null) {
			
			str = str + " [" + p.getInfo() + "] ";
			p = p.getProximo();
		}
		return str;
	}
}
