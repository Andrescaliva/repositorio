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

	public static boolean comparar(Carta c1, Carta c2) {
		if(c1!=null&&c2!=null){
			return c1.numero==c2.numero || c1.palo==c2.palo;
		}else {
			return false;
		}
		
	}
	
	
	

}
