package juegoCartas;

public class Juego {
	public static void main(String[] args) {
		Carta c = new Carta(3,2);
		System.out.println(c);
		Mazo m= new Mazo();
		m.mezclar();
		//m.mostrar();
		Mano jugador = new Mano();
		jugador.recibirCarta(c);
		jugador.mostrar();
	}
}
