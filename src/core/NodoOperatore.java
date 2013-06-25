package core;

public class NodoOperatore implements Nodo {

	private char simbolo;
	private Nodo sinistro;
	private Nodo destro;
	
	public NodoOperatore(char simbolo) {
		this.simbolo = simbolo;
	}
	
	public char getSimbolo() {
		return simbolo;
	}

	public Nodo getSinistro() {
		return sinistro;
	}

	public void setSinistro(Nodo sinistro) {
		this.sinistro = sinistro;
	}

	public Nodo getDestro() {
		return destro;
	}

	public void setDestro(Nodo destro) {
		this.destro = destro;
	}
	
}
