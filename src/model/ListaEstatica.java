package model;

public class ListaEstatica<T>{

	private Object[] info;
	private int tamanho;

	public ListaEstatica() {
		info = new Object[10];
	}

	private void redimensionar() {
		Object[] newVetor = new Object[info.length];
		for (int i = 0; i < info.length; i++) {
			newVetor[i] = info[i];
		}
		info = new Object[newVetor.length + 10];
		info = newVetor;

	}

	public void inserir(T valor) {
		if (tamanho == info.length + 1) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}

	public void exibir() {

		for (int i = 0; i < tamanho; i++) {
			System.out.println("[" + info[i] + "] ");
		}
	}

	public int buscar(T valor) {
		for (int i = 0; i < tamanho; i++) {
			if (info[i] == valor) {
				return i;
			}

		}
		return -1;
	}

	public void retirar(T valor) {
		int posicao = buscar(valor);
		if (posicao > -1) {
			for (int i = posicao; i < tamanho - 1; i++) {
				info[i] = info[i + 1];

			}
			tamanho--;

		}
	}

	public void liberar() {
		info = new Object[10];
	}

	public T obterElemento(int posicao) {
		if (posicao >= 0 && (posicao < tamanho)) { // Se a posição é válida
			return (T) info[posicao]; // Retorna o elemento na posição especificada
		} else {
			throw new java.lang.IndexOutOfBoundsException(); // Lança uma exceção se a posição for inválida

		}
	}

	public boolean estaVazia() {
		if (tamanho == 0)
			return true;
		return false;
	}

	public int getTamanho() {
		return tamanho;
	}

	@Override
	public String toString() {

		String texto = "";
		for (int i = 0; i < tamanho; i++) {
			texto = texto + "[" + info[i] + "] ";
		}
		return texto;

	}

}
