package model;

public class ListaEncadeada <T>{
	
	
	private NoLista<T> primeiro;
	
	public ListaEncadeada() {
		primeiro = null;
	}
	
	public NoLista<T> getPrimeiro() {
		return primeiro;
	}
	
	public void inserir(T info) {
		NoLista<T> novo = new NoLista<T>();
		novo.setInfo(info);
		novo.setProximo(primeiro);
		this.primeiro = novo;
	}
	public boolean estaVazia() {
		if (primeiro == null) {
			return true;
		}
		else {
			return false;
		}
	}
	public NoLista<T> buscar(T info){
		NoLista p = primeiro;
		while (primeiro != null) {
			if (p.getInfo() == info) {
				return p;
			}
			else {
				p = p.getProximo();
			}
		}
		return null;
		
	}
	public void retirar(T info) {
		NoLista anterior = null;
		NoLista p = primeiro;
		
		while (p != null && p.getInfo() != info) {
		    anterior = p;
			p = p.getProximo();
		}
		if (p != null) {
			if (p == primeiro) {
				this.primeiro = p.getProximo();
			}
			else {
				anterior.setProximo(p.getProximo());
			}
		}
	}
	public int obterComprimento() {
		int comprimento = 0;
		NoLista p = primeiro;
		while (p != null) {
			comprimento++;
		}
		return comprimento;
	}
	public NoLista<T> obterNo(int idx){
		int comprimento = 0;
		NoLista p = primeiro;
		while (p != null) {
			if (idx == comprimento) {
				return p;
			}else {
				p = p.getProximo();
				comprimento++;
			}
		}
		return null;
	}
	
	

	@Override
	public String toString() {
		String str = "";
		NoLista p = this.primeiro;
		while (p != null) {
			
			str = str + " [" + p.getInfo() + "] ";
			p = p.getProximo();
		}
		return str;
	}


}

	