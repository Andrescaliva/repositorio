package juegoCartas;

public class Mano {
	private Carta[] cartas;
	private int cantCartas;
	public Mano() {
		this.cartas=new Carta[40];
		this.cantCartas=0;
	}
	
	public void mostrar() {
		for(int i=0;i<cantCartas;i++) {
			System.out.println(cartas[i]);
		}
	}
	
	public void recibirCarta(Carta c) {
		cartas[cantCartas]=c;
		cantCartas++;
	}
	
	public Carta jugarCarta(int k) {
		Carta aux = cartas[k];
		cartas[k]=null;
		cantCartas--;
		return aux;
		
	}

}
