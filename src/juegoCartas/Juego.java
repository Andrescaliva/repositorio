package juegoCartas;

import java.util.Scanner;

public class Juego {
	public static void main(String[] args) {
		Mazo m= new Mazo();
		m.mezclar();
		//m.mostrar();
		Carta mesa;
		Scanner scan = new Scanner(System.in);
		Mano jugador = new Mano();
		
		jugador.mostrar();
		mesa=m.darCarta();
		for(int k=0;k<5;k++) {
			jugador.recibirCarta(m.darCarta());
		}
		while(jugador.cantidadCartas()>0||m.cantCartas()<0) {
			System.out.println("Carta en la mesa: "+mesa);
			jugador.mostrar();
			System.out.println("Elige una carta para jugar: ");
			int carta=scan.nextInt();
			Carta cartaJugada = jugador.jugarCarta(carta-1);
			if(Carta.comparar(mesa,cartaJugada)) {
				mesa=cartaJugada;
				System.out.println("Carta en la mesa: "+mesa);
			}else {
				System.out.println("Carta inavlida! Tom una carta de penalizacion");
				jugador.recibirCarta(cartaJugada);
				jugador.recibirCarta(m.darCarta());
				jugador.mostrar();
			}
		}
		if(jugador.cantidadCartas()==0) {
			System.out.println("GANASTE!!!");
		}
		else {
			System.out.println("PERDISTE!!!");
		}
		
	}
}
