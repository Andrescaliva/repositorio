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
			System.out.println(i+1+" - "+cartas[i]);
		}
	}
	
	public void recibirCarta(Carta c) {
		cartas[cantCartas]=c;
		cantCartas++;
	}
	
	public Carta jugarCarta(int k) {
		if(k<cantCartas) {
			Carta aux = cartas[k];
			cartas[k]=cartas[cantCartas-1];
			cantCartas--;
			return aux;
		}else {
			return null;
		}
		
		
	}
	
	public int cantidadCartas() {
		return cantCartas;
	}

}
