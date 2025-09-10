package juegoCartas;

public class Carta {
	private int palo;
	private int numero;
	
	public Carta(int p, int n) {
		this.palo=p;
		this.numero=n;
	}

	@Override
	public String toString() {
		String [] palos = {"espada","oro","basto","copas"};
		return numero+ " de " +palos[palo];
	}
	
	

}
